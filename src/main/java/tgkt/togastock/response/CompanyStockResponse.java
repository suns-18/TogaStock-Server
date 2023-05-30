package tgkt.togastock.response;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tgkt.togastock.bean.Stock;

@Data
@SuperBuilder
public class CompanyStockResponse extends BaseResponse{
    private Integer companyId;
    private Stock stock;
    private String exchange;
    private String chairman;
    private Double regCapital;
    private String website;
    private String mainBusiness;
    private String introduction;
}