package me.angukbum.springbootdeveloper.dto;

import lombok.Getter;
import me.angukbum.springbootdeveloper.domain.Comment;

@Getter
public class CommentResponse {
    private Long id;
    private String comment;
    private String createdDate;
    private String modifiedDate;
    private Long articleId;

    public CommentResponse(Comment comment){
        this.id = comment.getId();
        this.comment = comment.getComment();
        this.createdDate = comment.getCreatedDate();
        this.modifiedDate = comment.getModifiedDate();
        this.articleId = comment.getArticle().getId();

    }
}
