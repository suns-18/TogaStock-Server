package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Stock;

import java.util.List;

@Data
@SuperBuilder
public class CompanyStocksResponse extends BaseResponse{
    private List<CompanyStockResponse> list;
}