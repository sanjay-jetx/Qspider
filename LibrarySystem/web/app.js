// Client-Side Logic
// We use LocalStorage to simulate a database. No Java Server required!

document.addEventListener("DOMContentLoaded", () => {
    renderItems();
    renderMembers();
});

// Load data from browser storage or initialize with empty arrays
let items = JSON.parse(localStorage.getItem("library_items")) || [];
let members = JSON.parse(localStorage.getItem("library_members")) || [];

// Helper to save current state
function saveData() {
    localStorage.setItem("library_items", JSON.stringify(items));
    localStorage.setItem("library_members", JSON.stringify(members));
}

function switchTab(tab) {
    document.querySelectorAll('.tab-btn').forEach(btn => btn.classList.remove('active'));
    document.querySelectorAll('section').forEach(sec => sec.classList.add('hidden-section'));
    document.querySelectorAll('section').forEach(sec => sec.classList.remove('active-section'));

    if (tab === 'items') {
        document.querySelector('.tab-btn:nth-child(1)').classList.add('active');
        document.getElementById('items-section').classList.remove('hidden-section');
        document.getElementById('items-section').classList.add('active-section');
    } else {
        document.querySelector('.tab-btn:nth-child(2)').classList.add('active');
        document.getElementById('members-section').classList.remove('hidden-section');
        document.getElementById('members-section').classList.add('active-section');
    }
}

function toggleInputs() {
    const type = document.getElementById('itemType').value;
    if (type === 'Book') {
        document.getElementById('authorGroup').classList.remove('hidden');
        document.getElementById('issueGroup').classList.add('hidden');
    } else {
        document.getElementById('authorGroup').classList.add('hidden');
        document.getElementById('issueGroup').classList.remove('hidden');
    }
}

// ------ ACTIONS ------

document.getElementById('addItemForm').addEventListener('submit', (e) => {
    e.preventDefault();

    const type = document.getElementById('itemType').value;
    const title = document.getElementById('itemTitle').value;
    const id = document.getElementById('itemId').value;

    // Check for duplicate ID
    if (items.some(i => i.itemId === id)) {
        alert("Error: Item ID already exists!");
        return;
    }

    const newItem = { type, title, itemId: id };

    if (type === 'Book') {
        newItem.author = document.getElementById('itemAuthor').value;
    } else {
        newItem.issueNumber = document.getElementById('itemIssue').value;
    }

    items.push(newItem);
    saveData();
    renderItems();
    e.target.reset();
    showToast("Item Added Successfully!");
});

document.getElementById('addMemberForm').addEventListener('submit', (e) => {
    e.preventDefault();
    const name = document.getElementById('memberName').value;
    const id = document.getElementById('memberId').value;

    if (members.some(m => m.memberId === id)) {
        alert("Error: Member ID already exists!");
        return;
    }

    members.push({ name, memberId: id });
    saveData();
    renderMembers();
    e.target.reset();
    showToast("Member Registered!");
});

function deleteItem(id) {
    if (!confirm("Delete this item?")) return;
    items = items.filter(i => i.itemId !== id);
    saveData();
    renderItems();
}

function deleteMember(id) {
    if (!confirm("Delete this member?")) return;
    members = members.filter(m => m.memberId !== id);
    saveData();
    renderMembers();
}

// ------ RENDER ------

function renderItems() {
    const container = document.getElementById('itemsList');
    container.innerHTML = "";

    if (items.length === 0) {
        container.innerHTML = '<div class="empty-state">No items found. Add one above!</div>';
        return;
    }

    items.forEach(item => {
        const div = document.createElement('div');
        div.className = 'list-item';

        const typeBadge = item.type === 'Book' ?
            '<span class="badge badge-book">Book</span>' :
            '<span class="badge badge-magazine">Magazine</span>';

        const detail = item.type === 'Book' ? `Author: ${item.author}` : `Issue: ${item.issueNumber}`;

        div.innerHTML = `
            <div>
                <h3>${item.title}</h3>
                <p>${detail} <span class="badge badge-id">ID: ${item.itemId}</span></p>
            </div>
            <div class="details">
                ${typeBadge}
                <button class="delete-btn" onclick="deleteItem('${item.itemId}')">✕</button>
            </div>
        `;
        container.appendChild(div);
    });
}

function renderMembers() {
    const container = document.getElementById('membersList');
    container.innerHTML = "";

    if (members.length === 0) {
        container.innerHTML = '<div class="empty-state">No members registered.</div>';
        return;
    }

    members.forEach(m => {
        const div = document.createElement('div');
        div.className = 'list-item';
        div.innerHTML = `
            <div>
                <h3>${m.name}</h3>
                <p>Member ID: ${m.memberId}</p>
            </div>
            <div class="details">
                <button class="delete-btn" onclick="deleteMember('${m.memberId}')">✕</button>
            </div>
        `;
        container.appendChild(div);
    });
}

// Helper: Toast Notification
function showToast(msg) {
    const div = document.createElement('div');
    div.style.position = 'fixed';
    div.style.bottom = '20px';
    div.style.right = '20px';
    div.style.background = '#10b981';
    div.style.color = 'white';
    div.style.padding = '1rem 2rem';
    div.style.borderRadius = '8px';
    div.style.boxShadow = '0 4px 6px rgba(0,0,0,0.1)';
    div.style.zIndex = '1000';
    div.innerText = msg;
    document.body.appendChild(div);
    setTimeout(() => div.remove(), 3000);
}
