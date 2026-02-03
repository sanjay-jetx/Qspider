const API_URL = "http://localhost:8000/api";

document.addEventListener("DOMContentLoaded", () => {
    fetchItems();
    fetchMembers();
});

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

// ------ API CALLS ------

async function fetchItems() {
    try {
        const res = await fetch(`${API_URL}/items`);
        const items = await res.json();
        renderItems(items);
    } catch (e) {
        console.error("Failed to fetch items", e);
    }
}

async function fetchMembers() {
    try {
        const res = await fetch(`${API_URL}/members`);
        const members = await res.json();
        renderMembers(members);
    } catch (e) {
        console.error("Failed to fetch members", e);
    }
}

document.getElementById('addItemForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const type = document.getElementById('itemType').value;
    const title = document.getElementById('itemTitle').value;
    const id = document.getElementById('itemId').value;
    
    let extra = "";
    if (type === 'Book') {
        extra = document.getElementById('itemAuthor').value;
    } else {
        extra = document.getElementById('itemIssue').value;
    }

    const payload = { type, title, id, extra };

    try {
        await fetch(`${API_URL}/items`, {
            method: 'POST',
            body: JSON.stringify(payload)
        });
        fetchItems(); // Refresh List
        e.target.reset();
    } catch (e) {
        alert("Error adding item");
    }
});

document.getElementById('addMemberForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    const name = document.getElementById('memberName').value;
    const id = document.getElementById('memberId').value;

    try {
        await fetch(`${API_URL}/members`, {
            method: 'POST',
            body: JSON.stringify({ name, id })
        });
        fetchMembers();
        e.target.reset();
    } catch (e) {
        alert("Error adding member");
    }
});

async function deleteItem(id) {
    if(!confirm("Delete this item?")) return;
    try {
        await fetch(`${API_URL}/delete-item`, {
            method: 'POST',
            body: id
        });
        fetchItems();
    } catch (e) {
        alert("Error deleting item");
    }
}

// ------ RENDER ------

function renderItems(items) {
    const container = document.getElementById('itemsList');
    container.innerHTML = "";

    if (items.length === 0) {
        container.innerHTML = '<div class="empty-state">No items found. Add one above!</div>';
        return;
    }

    items.forEach(item => {
        const div = document.createElement('div');
        div.className = 'list-item';
        // Check if item has 'author' (Book) or 'issueNumber' (Magazine)
        // Since we receive JSON, we rely on the object keys
        const typeBadge = item.author ? 
            '<span class="badge badge-book">Book</span>' : 
            '<span class="badge badge-magazine">Magazine</span>';
        
        const detail = item.author ? `Author: ${item.author}` : `Issue: ${item.issueNumber}`;

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

function renderMembers(members) {
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
        `;
        container.appendChild(div);
    });
}
