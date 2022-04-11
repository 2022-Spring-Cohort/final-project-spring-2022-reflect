export default function mindsetWhy(user) {
  return `

  // <div class = "why-card-container">
  // <ul>

  ${user.user
    .map((card) => {
      return `<h3 class="book-title">${user.front}</h3>`;
    })
    .join("")}

`;
}
