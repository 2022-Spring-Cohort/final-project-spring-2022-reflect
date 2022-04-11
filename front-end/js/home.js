export default function home(user) {
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
            <h3 class="article-header">Daily Article</h3>
            <div class="thumb-container">
                <img class="article-thumb" src="./images/tibetan-bowl.png">
            </div>
            <p class="article-summary">A short summary of article content goes here. A short summary of article content goes here. A short summary of article content goes here.</p>
        </section>
    </div>
    `;
}
