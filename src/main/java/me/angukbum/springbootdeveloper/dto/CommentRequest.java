package me.angukbum.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.angukbum.springbootdeveloper.domain.Article;
import me.angukbum.springbootdeveloper.domain.Comment;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentRequest {
    private Long id;
    private String comment;
    private String createdDate;
    private String modifiedDate;
    private Article article;

    public Comment toEntity(){
        Comment comments = Comment.builder()
                .id(id)
                .comment(comment)
                .createdDate(createdDate)
                .modifiedDate(modifiedDate)
                .article(article)
                .build();
        return comments;
    }
}
