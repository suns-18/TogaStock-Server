package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Order {
    private String orderNo;
    private Integer userId;
    private Integer tsCode;
    private String type;
    private Double dealPrice;
    private Integer dealNumber;
    private Integer dealValue;
    private String dealDate;
    private String status;
}
