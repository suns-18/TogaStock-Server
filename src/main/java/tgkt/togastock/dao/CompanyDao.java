package tgkt.togastock.dao;

import org.apache.ibatis.annotations.Mapper;
import tgkt.togastock.bean.Company;

@Mapper
public interface CompanyDao {
    Company getByID(int companyId);

    Company getAllList();

    void insert(Company company);

    void update(Company company);
}
