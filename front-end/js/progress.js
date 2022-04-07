export default function progressView(user) {
    return`
    <div class="main-content">
            <section class="progress-chart">
                <img class="line-chart" src="./images/line-graph-example.jpg">
            </section>
            <section class="progress-journal">
                <div class="journal-item">
                    <h2>Date</h2>
                    <h3>Duration</h3>
                    <p>Comments about the day's session. Comments about the day's session. Comments about the day's session.</p>
                </div>
                <div class="journal-item">
                    <h2>Date</h2>
                    <h3>Duration</h3>
                    <p>Comments about the day's session. Comments about the day's session. Comments about the day's session.</p>
                </div>

                `

            })
            .join("")}
        </section>
        <div class="newSessionDiv">
            <input type="text" placeholder="Date" class="sessionDateInput">
            <input type="text" placeholder="Duration" class="sessionDurationInput">
            <input type="text" placeholder="Notes" class="sessionNoteInput">  
            <button class="addSessionButton">Add session</button>
=======
            </section>

        </div>
    `
}