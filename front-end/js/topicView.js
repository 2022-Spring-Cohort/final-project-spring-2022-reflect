export default function topicView(topic) {
    console.log(topic)
    return `
    <div class="main-content">
        <div class="topic-header">
          <h2 class="topic">${topic.name}</h2>
        </div>
        ${topic.articles.map(article =>{
            return`
            <article class="article">
          <h2 class="article-title">${article.title}</h2>
          <a href="${article.link}" target="blank">
            <img src="${article.image}" alt="Article"
          /></a>
          <p class="article-summary">${article.content} </p>
        </article>
            `
        }).join("")}
        
        
      </div>

    `;
}