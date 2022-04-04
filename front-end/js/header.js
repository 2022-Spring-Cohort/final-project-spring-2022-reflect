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
                    <li class="meditate"><a href="#" class="nav-links">Meditate</a></li>
                    <li><a href="#" class="nav-links">Contact</a></li>
                    <li><a href="#" class="nav-links">Sign Up</a></li>
                </ul>
                <img src="./images/ham-menu-icon.png" class="hamburger">
                <i src="menu-icon material-icon" class="menu-icon">
                <i src="close-icon material-icon" class="close-icon">
            </nav>
        </div>
    </header>
    `
}