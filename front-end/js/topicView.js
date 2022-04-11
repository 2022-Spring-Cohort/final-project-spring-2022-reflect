export default function topicView(topic) {
    console.log(topic)
    return `
    <div class="main-content">
        <div class="topic-header">
          <h2 class="topic">${topic.name}</h2>
        </div>
        ${topic.articles.map(article =>{
            return`
          
         

    <div class="container3">
       
        <a class="article-link" href="${article.link}" target="blank">
        <h3 class="article-title"> ${article.title} </h3>
          <img class"article-img" src="${article.picture}" alt="Article" >
            </a>
        <p class="article-summary">${article.content} </p>
    </div> 
         
            `
        }).join("")}
        
        
      </div>

    `;
}