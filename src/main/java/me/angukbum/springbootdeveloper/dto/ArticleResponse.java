package me.angukbum.springbootdeveloper.dto;

import lombok.Getter;
import me.angukbum.springbootdeveloper.domain.Article;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    private List<CommentResponse> comments;


    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
        this.comments = article.getComments().stream().map(CommentResponse::new).collect(Collectors.toList());

    }
}
