package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Company {
    private Integer companyId;
    private String tsCode;
    private String exchange;
    private String chairman;
    private Double regCapital;
    private String website;
    private String mainBusiness;
    private String introduction;
}
