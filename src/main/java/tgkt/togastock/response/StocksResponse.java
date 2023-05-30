package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class StocksResponse extends BaseResponse {
    private List<StockResponse> list;
}
