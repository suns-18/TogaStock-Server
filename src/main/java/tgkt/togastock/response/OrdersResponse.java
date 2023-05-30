package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Stock;
import tgkt.togastock.bean.User;

import java.util.List;

@Data
@SuperBuilder
public class OrdersResponse extends BaseResponse {
    private List<OrderResponse> list;
}
