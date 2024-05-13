package com.example.enjoytrip.board.domain;

import com.example.enjoytrip.comment.domain.CommentDto;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardDto {
    private int boardId;
    private int boardTouristspotId;
    private String boardTitle;
    private String boardContent;
    private String boardAccountNickname;
    private int boardAccountId;
    private List<CommentDto> boardComment;
}
