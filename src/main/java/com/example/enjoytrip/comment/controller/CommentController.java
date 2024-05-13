package com.example.enjoytrip.comment.controller;

import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.board.service.BoardService;
import com.example.enjoytrip.comment.domain.CommentDto;
import com.example.enjoytrip.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController{

    @Autowired
    CommentService commentService;

    @GetMapping("/boards/comments/{commentBoardId}")
    public List<CommentDto> commentList(@PathVariable("commentBoardId") int commentBoardId){
        List<CommentDto> list = commentService.commentList(commentBoardId);
        return list;
    }

    @GetMapping("/boards/comments/{commentId}/")
    public ResponseEntity<CommentDto> commentDetail(@PathVariable("commentId") int commentId){
        CommentDto dto = commentService.commentDetail(commentId);
        return ResponseEntity.internalServerError().body(dto);
    }

    @PutMapping("/boards/{commentBoardId}")
    public int commentUpdate(@PathVariable("commentBoardId") int commentBoardId, CommentDto commentDto){
        return commentService.commentUpdate(commentDto);
    }

    @PostMapping("/boards/{commentBoardId}")
    public int commentInsert(@PathVariable("commentBoardId") int commentBoardId, CommentDto commentDto){
        return commentService.commentInsert(commentDto);
    }

    @DeleteMapping("/boards/{commentId}")
    public int commentDelete(@PathVariable("commentId") int commentId){
        return commentService.commentDelete(commentId);
    }


}
