package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Account;
import tgkt.togastock.bean.Stock;

import java.util.List;


@Data
@SuperBuilder
public class AccountPositionsResponse extends BaseResponse {
    private List<AccountPositionResponse> list;
}
