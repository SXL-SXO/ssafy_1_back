package com.example.enjoytrip.board.dao;

import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.common.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    List<BoardDto> boardList(PageDto pageDto);
    BoardDto boardDetail(int boardId);
    int boardInsert(BoardDto boardDto);
    int boardUpdate(BoardDto boardDto);
    int boardDelete(int boardId);
}
