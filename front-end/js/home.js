export default function home(user) {
    console.log(user)
    return `
    <header>
        <div class="nav-bar">
            <nav class="brand">
                <a href="#" class="home-link">Reflect</a>
                <div class="menu-toggle" id="menu-toggle">
                    <span class="bar"></span>
                    <span class="bar"></span>
                    <span class="bar"></span>
                </div>
                <ul class="menu" id="ham-menu">
                    <li><a href="#" class="nav-links">Home</a></li>
                    <li><a href="#" class="nav-links">Profile</a></li>
                    <li><a href="#" class="nav-links">About</a></li>
                    <li><a href="#" class="nav-links">Contact</a></li>
                    <li><a href="#" class="nav-links-btn">Sign Up</a></li>
                </ul>
                <img src="./images/ham-menu-icon.png" class ="hamburger">
            </nav>
        </div>
    </header>

    <div class ="main-content">
        <section class="welcome">
            <h1>Hello, User!</h1>
        </section>
        <section class="inspo-quote-container">
            <h3 class="inspo-quote"></h3>
            <p>-Albert Einstein</p>
        </section>
        <section class="daily-article" href="#">
            <h3>Daily Article</h3>
            <img class="article-thumb" src="./images/tibetan-bowl.png">
            <p>A short summary of article content goes here. A short summary of article content goes here. A short summary of article content goes here.</p>
        </section>
    </div>
    `
}