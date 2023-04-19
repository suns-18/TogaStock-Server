package tgkt.togastock.bean;

import lombok.Data;

@Data
public class Company {
    private Integer ID;
    private Stock stock;
    private String exchange;
    private String chairman;
    private Double regCapital;
    private String website;
    private String mainBusiness;
    private String intro;
}
