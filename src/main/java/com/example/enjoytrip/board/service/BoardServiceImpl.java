package com.example.enjoytrip.board.service;

import com.example.enjoytrip.board.dao.BoardDao;
import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.comment.dao.CommentDao;
import com.example.enjoytrip.comment.domain.CommentDto;
import com.example.enjoytrip.common.dto.PageDto;
import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDao boardDao;
    private final CommentDao commentDao;

    @Override
    public List<BoardDto> boardList(PageDto pageDto) {
        return boardDao.boardList(pageDto);
    }

    @Transactional
    @Override
    public BoardDto BoardDetailswithComment(int boardId) {
        BoardDto boardDto = boardDao.boardDetail(boardId);
        boardDto.setBoardComment(commentDao.commentList(boardId));
        return boardDto;
    }

    @Override
    public BoardDto boardDetail(int boardId) {
        return boardDao.boardDetail(boardId);
    }

    @Override
    public int boardInsert(BoardDto boardDto) {return boardDao.boardInsert(boardDto);}

    @Override
    public int boardUpdate(BoardDto boardDto) {
        return boardDao.boardUpdate(boardDto);
    }

    @Override
    public int boardDelete(int boardId) {
        return boardDao.boardDelete(boardId);
    }

    @Override
    public int boardRecommend(int boardId, int boardRecommend) {
        return boardDao.boardRecommend(boardId, boardRecommend+1);
    }

    @Override
    public List<CommentDto> commentList(int commentBoardId) {
        return commentDao.commentList(commentBoardId);
    }


}
