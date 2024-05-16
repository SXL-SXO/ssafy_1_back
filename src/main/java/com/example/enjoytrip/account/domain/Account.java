package com.example.enjoytrip.account.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Account {
    private Integer accountId;
    private String accountEmail;
    private String accountPassword;
    private String accountNickname;
    private String accountProfileImage;
    private AccountRole accountRole;
    private AccountMbti accountMbti;

}
