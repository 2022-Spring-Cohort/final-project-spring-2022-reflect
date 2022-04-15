export default function progressView(user) {
    return`
    <div class="main-content">
        <div class="progress-chart">
            <canvas id="myChart" width="400" height="400"></canvas>
        </div>
        
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
        <div class="newSessionDiv">
            <input type="text" placeholder="Date" class="sessionDateInput">
            <input type="text" placeholder="Duration" class="sessionDurationInput">
            <input type="text" placeholder="Notes" class="sessionNoteInput">  
            <button class="addSessionButton">Add Session</button>
        </div>
    
    </div>
    
    `
    
}