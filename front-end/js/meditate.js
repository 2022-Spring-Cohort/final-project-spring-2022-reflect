export default function meditate() {
    return `
    <div class="main-content">
            <section class="timer">
                <div id="clockdiv">
                    
                </div>
            </section>
            <section class="timer-buttons">
                <div class="play-button">
                    <img src="./images/playButton.png" class="play-image">
                </div>
                <div class="pause-button">
                    <img class="pause-image" src="./images/pauseButton.png">
                </section>
            <div class="audio">
            </div>
            <div class=meditateVid">
            <iframe  width="460" height="215" src="https://www.youtube.com/embed/Hzi3PDz1AWU" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </div>
            
            </div>
        </div>
    `
}