package tgkt.togastock.response;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Account;

@Data
@SuperBuilder
public class UserAccountResponse extends BaseResponse{
    private Integer userId;
    private Account account;
    private String nickName;
    private String name;
    private String phone;
    private String password;
    private String gender;
    private String createTime;
    private String updateTime;
    private String status;
}
