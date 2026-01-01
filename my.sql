-- 1️⃣ Show all databases
SHOW DATABASES;

-- 2️⃣ Create a new database
CREATE DATABASE IF NOT EXISTS qspider_db;
USE qspider_db;


-- 3️⃣ Use the database

-- 4️⃣ Create a table
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    marks INT
);

-- 5️⃣ Insert records
INSERT INTO students VALUES
(1, 'Pranesh', 20, 85),
(2, 'Sanjay', 21, 78),
(3, 'Arun', 22, 90),
(4, 'Kumar', 20, 65);

-- 6️⃣ View all records
SELECT * FROM students;

-- 7️⃣ View specific columns
SELECT name, marks FROM students;

-- 8️⃣ Apply condition
SELECT * FROM students WHERE marks > 75;

-- 9️⃣ Update data
UPDATE students
SET marks = 88
WHERE id = 2;

-- 🔟 Delete a record
DELETE FROM students
WHERE id = 4;

-- 1️⃣1️⃣ Order by marks (highest first)
SELECT * FROM students ORDER BY marks DESC;

-- 1️⃣2️⃣ Count students
SELECT COUNT(*) AS total_students FROM students;

-- 1️⃣3️⃣ Maximum marks
SELECT MAX(marks) AS highest_marks FROM students;

-- 1️⃣4️⃣ Minimum marks
SELECT MIN(marks) AS lowest_marks FROM students;

-- 1️⃣5️⃣ Average marks
SELECT AVG(marks) AS average_marks FROM students;

-- 1️⃣6️⃣ Drop table (optional)
-- DROP TABLE students;

-- 1️⃣7️⃣ Drop database (optional)
-- DROP DATABASE qspider_db;

