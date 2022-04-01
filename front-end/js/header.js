export default function header() {
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
    `
}