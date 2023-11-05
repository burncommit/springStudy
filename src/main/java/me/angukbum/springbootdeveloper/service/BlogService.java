package me.angukbum.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.angukbum.springbootdeveloper.domain.Article;
import me.angukbum.springbootdeveloper.dto.AddArticleRequest;
import me.angukbum.springbootdeveloper.dto.UpdateArticleRequest;
import me.angukbum.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //빈을 생성자로 생성하는 어노테이션 final키워드나 @notNull붙은 필드를  생성자로만듬
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return  blogRepository.save(request.toEntity());
    }
    public List<Article> findAll(){
        return blogRepository.findAll();
    }
    public Article findById(long id)    {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }
    public void delete(long id){
        blogRepository.deleteById(id);
    }
    @Transactional
    public Article update(long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found :" + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
