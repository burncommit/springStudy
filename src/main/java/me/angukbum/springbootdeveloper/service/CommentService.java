package me.angukbum.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.angukbum.springbootdeveloper.domain.Article;
import me.angukbum.springbootdeveloper.domain.Comment;
import me.angukbum.springbootdeveloper.dto.CommentRequest;
import me.angukbum.springbootdeveloper.repository.BlogRepository;
import me.angukbum.springbootdeveloper.repository.CommentRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final BlogRepository blogRepository;

    //생성
    public Long CommentSave(Long id, CommentRequest commentRequest){
        Article article = blogRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글 존재 안함"));
        commentRequest.setArticle(article);

        Comment comment = commentRequest.toEntity();
        commentRepository.save(comment);

        return commentRequest.getId();
    }
}
