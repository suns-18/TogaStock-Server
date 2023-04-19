package tgkt.togastock.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer ID;
    private Account account;
    private String nickName;
    private String name;
    private String phone;
    private String password;
    private String gender;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String status;
}
