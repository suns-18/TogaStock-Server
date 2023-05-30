package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Company {
    private Integer companyId;
    private Integer tsCode;
    private String exchange;
    private String chairman;
    private Double regCapital;
    private String website;
    private String mainBusiness;
    private String introduction;
}
