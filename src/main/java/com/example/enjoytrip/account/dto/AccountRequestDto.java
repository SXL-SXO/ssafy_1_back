package com.example.enjoytrip.account.dto;

import com.example.enjoytrip.account.domain.Account;
import com.example.enjoytrip.account.domain.AccountMbti;
import com.example.enjoytrip.account.domain.AccountRole;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountRequestDto {
    private String accountEmail;
    private String accountPassword;
    private String accountNickname;
    private String accountProfileImage;
    private AccountMbti accountMbti;
    private AccountRole accountRole;
}
