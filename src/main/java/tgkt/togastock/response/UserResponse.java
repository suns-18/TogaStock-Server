package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Account;
import tgkt.togastock.bean.User;

@Data
@SuperBuilder
public class UserResponse extends BaseResponse{
    private Integer userId;
    private String nickName;
    private String name;
    private String phone;
    private String password;
    private String gender;
    private String createTime;
    private String updateTime;
    private String status;
}
