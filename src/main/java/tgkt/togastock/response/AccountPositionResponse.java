package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Account;
import tgkt.togastock.bean.Stock;


@Data
@SuperBuilder
public class AccountPositionResponse extends BaseResponse {
    private Account account;
    private Integer positionId;
    private Stock stock;
    private Double dealPrice;
    private Integer number;
    private Double cost;
    private Double marketPrice;
    private Double marketValue;
    private Integer profitLoss;
    private String dealTime;
}
