package com.example.enjoytrip.board.controller;

import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.board.service.BoardService;
import com.example.enjoytrip.common.dto.PageDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BoardController {

    BoardService boardService;

    @GetMapping("/boards/{pageSize}/{pageNum}")
    public List<BoardDto> boardList(@PathVariable("pageSize") int pageSize, @PathVariable("pageNum") int pageNum){
        PageDto pageDto = new PageDto(pageSize, pageNum);
        List<BoardDto> list = boardService.boardList(pageDto);
        return list;
    }

    @GetMapping("/boards/{boardId}")
    public ResponseEntity<BoardDto> boardDetail(@PathVariable("boardId") int boardId){
        BoardDto dto = boardService.boardDetail(boardId);
        return ResponseEntity.internalServerError().body(dto);
    }

    @PutMapping("/boards/{boardId}")
    public int boardUpdate(@PathVariable("boardId") int boardId, BoardDto dto){
        return boardService.boardUpdate(dto);
    }

    @PutMapping("/boards/recommend/{boardId}")
    public int boardRecommend(@PathVariable("boardId") int boardId, int boardRecommend){
        return boardService.boardRecommend(boardId, boardRecommend);
    }

    @PostMapping("/boards/{boardId}")
    public int boardInsert(@PathVariable("boardId") int boardId, BoardDto dto){
        return boardService.boardInsert(dto);
    }

    @DeleteMapping("boards/{boardId}")
    public int boardDelete(@PathVariable("boardId") int boardId){
        return boardService.boardDelete(boardId);
    }
}
