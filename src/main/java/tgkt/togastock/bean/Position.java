package tgkt.togastock.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Position {
    private Integer ID;
    private Account account;
    private Stock stock;
    private Double dealPrice;
    private Integer number;
    private Double cost;
    private Double marketPrice;
    private Double marketValue;
    private Integer profitLoss;
    private LocalDateTime dealTime;
}
