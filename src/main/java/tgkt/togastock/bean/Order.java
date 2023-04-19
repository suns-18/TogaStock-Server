package tgkt.togastock.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Order {
    private String ID;
    private User user;
    private Stock stock;
    private String type;
    private Double dealPrice;
    private Integer dealNumber;
    private Integer dealValue;
    private LocalDateTime dealDate;
    private String status;
}
