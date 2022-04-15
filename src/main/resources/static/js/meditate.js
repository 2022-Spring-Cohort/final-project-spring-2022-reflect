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
            </div>
        </section>
        <div class="audio">
        
        </div>
        <div class="end-session">
            <button class="end-button">End Session</button>
        </div>
    </div>
    `
}