package tgkt.togastock.bean;

import lombok.Data;


@Data
public class Position {
    private Integer positionId;
    private Integer accountId;
    private Integer tsCode;
    private Double dealPrice;
    private Integer number;
    private Double cost;
    private Double marketPrice;
    private Double marketValue;
    private Integer profitLoss;
    private String dealTime;
}
