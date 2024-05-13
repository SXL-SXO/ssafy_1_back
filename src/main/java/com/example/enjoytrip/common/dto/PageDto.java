package com.example.enjoytrip.common.dto;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class PageDto {

    private int pageSize;
    private int pageNum;
}
