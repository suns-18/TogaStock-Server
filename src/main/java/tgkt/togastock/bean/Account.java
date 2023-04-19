package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Account {
    private Integer ID;
    private Integer asset;
    private Integer marketValue;
    private Integer moneyRest;
}
