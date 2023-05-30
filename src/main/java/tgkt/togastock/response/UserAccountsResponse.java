package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Account;

import java.util.List;

@Data
@SuperBuilder
public class UserAccountsResponse extends BaseResponse{
    private List<UserAccountResponse> list;
}
