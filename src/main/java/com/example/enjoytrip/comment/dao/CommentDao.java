package com.example.enjoytrip.comment.dao;

import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.comment.domain.CommentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    List<CommentDto> commentList(int commentBoardId);
    CommentDto commentDetail(int commentId);
    int commentInsert(CommentDto commentDto);
    int commentUpdate(CommentDto commentDto);
    int commentDelete(int commentId);
}
