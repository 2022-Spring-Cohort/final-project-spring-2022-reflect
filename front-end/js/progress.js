export default function progressView(user) {
    console.log(user)
    return`
    <div class="main-content">
            <section class="progress-chart">
                <img class="line-chart" src="./images/line-graph-example.jpg">
            </section>
            <section class="progress-journal">
                ${user.sessions.map((session) => {
                    return `
                    <div class="journal-item">
                    <h2>${session.date}</h2>
                    <h3>${session.duration} minutes</h3>
                    <p>${session.note}</p>
                    </div>
                    `

                })
                .join("")}
            </section>
        </div>
    `
}