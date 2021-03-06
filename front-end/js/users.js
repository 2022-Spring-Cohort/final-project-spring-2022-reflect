export default function userView(users) {
    return `
    <div class="nav-bar">
        <nav class="brand">
            <p class="home-link">Reflect<p>
        </nav>
    </div>
    <h2 class="choose-user">Please select a user:</h2>
    <section class="userList">
    ${users.map(user => {
        return `
            <div class="userInfo">
            <input type="hidden" class="id_field" value="${user.id}" >
            <h2 class="user-name">${user.name}</h2>
            </div>
            `
    }).join("")
    }
    </section>
    <section class="new-user">
    <input type="text" class="newUser-name" placeholder="Name">
    <button class="newUser-button">Create New User</button>
    `
}