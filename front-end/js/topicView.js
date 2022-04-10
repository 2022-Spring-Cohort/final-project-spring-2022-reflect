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
       
        <a href="${article.link}" target="blank">
          <img src="${article.picture}" alt="Article" >
            <h3> ${article.title}</h3>
        </a>
    </div>   
    
          <p class="article-summary">${article.content} </p>
        // </article>
         
            `
        }).join("")}
        
        
      </div>

    `;
}