export default function timerSelectView(meditationIncrements) {
    return`
    <section class="timer_select">
        <div class="list-choice">
            <div class="list-choice-title">Timer</div>
            <div class="list-choice-objects">
            ${meditationIncrements.map(increment => {
                return`
                <div class="increment-container">
                <button class="increment-button" name="time" /> <span>${increment}:00</span>
                <input type="hidden" class="increment-id" value="${increment}">
                </div>
                `
            }

            ).join("")
            }
            </div>
        </div>
      </section>
    `
}