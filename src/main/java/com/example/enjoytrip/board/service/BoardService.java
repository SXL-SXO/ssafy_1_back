package com.example.enjoytrip.board.service;

import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.comment.domain.CommentDto;
import com.example.enjoytrip.common.dto.PageDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BoardService {
    List<BoardDto> boardList(PageDto pageDto);

    @Transactional
    BoardDto BoardDetailswithComment(int boardId);
    BoardDto boardDetail(int boardId);
    int boardInsert(BoardDto boardDto);
    int boardUpdate(BoardDto boardDto);
    int boardDelete(int boardId);
    int boardRecommend(int boardId, int boardRecommend);
    List<CommentDto> commentList(int commentBoardId);
}
