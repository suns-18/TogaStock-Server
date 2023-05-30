package tgkt.togastock.bean;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private Integer accountId;
    private String nickName;
    private String name;
    private String phone;
    private String password;
    private String gender;
    private String createTime;
    private String updateTime;
    private String status;
}
