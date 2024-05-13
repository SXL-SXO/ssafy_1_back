package com.example.enjoytrip.comment.service;

import com.example.enjoytrip.comment.domain.CommentDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> commentList(int commentBoardId);
    CommentDto commentDetail(int commentId);
    int commentInsert(CommentDto commentDto);
    int commentUpdate(CommentDto commentDto);
    int commentDelete(int commentId);
}
