package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Stock {
    private String tsCode;
    private String symbol;
    private String name;
    private String area;
    private String industry;
    private String market;
    private String exchange;
}
