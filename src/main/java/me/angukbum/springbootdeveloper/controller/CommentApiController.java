package me.angukbum.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.angukbum.springbootdeveloper.dto.CommentRequest;
import me.angukbum.springbootdeveloper.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class CommentApiController {
    private final CommentService commentService;

    @PostMapping("/Article/{id}/comments")
    public ResponseEntity commentSave(@PathVariable Long id, @RequestBody CommentRequest commentRequest){
        return ResponseEntity.ok(commentService.CommentSave(id, commentRequest));
    }
}
