package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Stock;
import tgkt.togastock.bean.User;

@Data
@SuperBuilder
public class OrderResponse extends BaseResponse {
    private String orderNo;
    private User user;
    private Stock stock;
    private String type;
    private Double dealPrice;
    private Integer dealNumber;
    private Integer dealValue;
    private String dealDate;
    private String status;
}
