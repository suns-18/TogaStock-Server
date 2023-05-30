package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Account {
    private Integer accountId;
    private Integer asset;
    private Integer marketValue;
    private Integer moneyRest;
}
