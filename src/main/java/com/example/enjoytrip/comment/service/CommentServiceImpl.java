package com.example.enjoytrip.comment.service;

import com.example.enjoytrip.comment.dao.CommentDao;
import com.example.enjoytrip.comment.domain.CommentDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentDao commentDao;

    @Override
    public List<CommentDto> commentList(int commentBoardId) {
        return commentDao.commentList(commentBoardId);
    }

    @Override
    public CommentDto commentDetail(int commentId) {
        return commentDao.commentDetail(commentId);
    }

    @Override
    public int commentInsert(CommentDto commentDto) {
        return commentDao.commentInsert(commentDto);
    }

    @Override
    public int commentUpdate(CommentDto commentDto) {
        return commentDao.commentUpdate(commentDto);
    }

    @Override
    public int commentDelete(int commentId) {
        return commentDao.commentDelete(commentId);
    }
}
