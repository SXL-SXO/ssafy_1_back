package com.example.enjoytrip;

import com.example.enjoytrip.board.domain.BoardDto;
import com.example.enjoytrip.board.service.BoardService;
import com.example.enjoytrip.common.dto.PageDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor


public class controller {
    @GetMapping("/")
    public String vvvv(){
        return "board.html";
    }
}
