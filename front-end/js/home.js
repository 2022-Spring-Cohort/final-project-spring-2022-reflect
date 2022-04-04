export default function home(user) {
  console.log(user);
  return `
    <div class ="main-content">
        <section class="welcome">
            <h1>Hello, ${user.name}!</h1>
        </section>
        <section class="inspo-quote-container">
            <h3 class="inspo-quote"></h3>
            <p class="inspo-author"></p>
        </section>
        <section class="daily-article" href="#">
            <h3>Daily Article</h3>
            <img class="article-thumb" src="./images/tibetan-bowl.png">
            <p>A short summary of article content goes here. A short summary of article content goes here. A short summary of article content goes here.</p>
        </section>
    </div>
    `;
}
