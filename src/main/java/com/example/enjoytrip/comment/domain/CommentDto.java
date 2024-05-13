package com.example.enjoytrip.comment.domain;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentDto {
    private int commentId;
    private int commentBoardId;
    private int commentAccountId;
    private String commentAccountNickname;
    private String commentContent;
}
