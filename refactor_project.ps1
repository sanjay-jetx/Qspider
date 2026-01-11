$ErrorActionPreference = "Continue"
$root = "c:\Users\sanja\QSpyder_programming"
$logFile = "$root\refactor_log.txt"

function Log-Message($msg) {
    echo $msg
    $msg | Out-File -FilePath $logFile -Append -Encoding UTF8
}

Log-Message "Starting Refactor in $root"

# Hardcoded folders to avoid Get-ChildItem issues
$folders = @("2D_array", "Array", "Binarysearch", "OOPS", "Object", "Random", "Searching", "Task_1", "assigment", "encapsulation", "if", "java", "method", "number _program", "operator", "pattern", "return_1", "sliding_window", "star_pattern", "two_pointers", "while_basic")
$folderPattern = $folders -join "|"
Log-Message "Folders pattern: $folderPattern"

$files = Get-ChildItem -Path $root -Filter "*.java" -Recurse

Log-Message "Found $( $files.Count ) files"

foreach ($file in $files) {
    # Log-Message "Processing $($file.Name)"
    try {
        $content = Get-Content -LiteralPath $file.FullName -Raw -Encoding UTF8
    }
    catch {
        Log-Message "Error reading $($file.FullName)"
        continue
    }

    $modified = $false
    
    # 1. Remove Package
    if ($content -match "(?m)^\s*package\s+.*;") {
        $content = $content -replace "(?m)^\s*package\s+.*;", ""
        $modified = $true
    }

    # 2. Fix Imports
    if ($content -match "(?m)^(import\s+($folderPattern)\..*;)") {
        $content = $content -replace "(?m)^(import\s+($folderPattern)\..*;)", "// `$1 // Refactored"
        $modified = $true
    }

    # 3. Rename Checks
    $targetName = $file.Name
    if ($content -match "public\s+class\s+(\w+)") {
        $className = $matches[1]
        $targetName = "$className.java"
    }

    # SAVE changes
    if ($modified) {
        Set-Content -LiteralPath $file.FullName -Value $content -Encoding UTF8
        # Log-Message "Modifed content of $($file.Name)"
    }

    # RENAME
    if ($targetName -ne $file.Name) {
        $targetPath = Join-Path $file.DirectoryName $targetName
        if (-not (Test-Path $targetPath)) {
            Log-Message "Renaming $($file.Name) -> $targetName"
            Rename-Item -LiteralPath $file.FullName -NewName $targetName -Force
        }
    }
}

Log-Message "Done."
