package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class StockResponse extends BaseResponse {
    private String tsCode;
    private String symbol;
    private String name;
    private String area;
    private String industry;
    private String market;
    private String exchange;
}
