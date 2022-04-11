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
                    <li class="homeLink"><a href="#" class="nav-links">Home</a></li>
                    <li class="aboutLink"><a href="#" class="nav-links">About</a></li>
                    <li class="meditate"><a href="#" class="nav-links">Meditate</a></li>
                    <li class="progressLink"><a href="#" class="nav-links">Progress</a></li>
                    <li class="categories"><a href="#" class="nav-links">Categories</a></li>
                    <li class="usersLink"><a href="#" class="nav-links">Users</a></li>
                    <li><img class="x-icon" src="./images/close-icon.png"></li>
                </ul>
                <img src="./images/ham-menu-icon.png" class="hamburger">
                <i src="menu-icon material-icon" class="menu-icon">
                <i src="close-icon material-icon" class="close-icon">
            </nav>
        </div>
    </header>
    `
}