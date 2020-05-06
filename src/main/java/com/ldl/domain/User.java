package com.ldl.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String userPwd;
    private String nickname;
}
