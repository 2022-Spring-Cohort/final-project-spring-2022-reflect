export default function timerSelectView(meditationIncrements) {
    return`
    <section class="timer_select">
        <div class="list-choice">
            <div class="list-choice-title">
                <h2>Select A Timer</h2>
            </div>
            <div class="list-choice-objects">
            ${meditationIncrements.map(increment => {
                return`
                <div class="increment-container">
                <h2 class="increment-button" name="time" />${increment}:00</h2>
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