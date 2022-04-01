export default function userView(users) {
    return `
    <section class="userList">
    ${users.map(user => {
        return `
            <div class="userInfo">
            <input type="hidden" class="id_field" value="${user.id}" >
            <h2 class"user-name">${user.name}</h2>
            </div>
            `
    }).join("")
    }
    </section>
    `
}