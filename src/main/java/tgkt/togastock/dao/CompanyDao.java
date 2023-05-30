package tgkt.togastock.dao;

import org.apache.ibatis.annotations.Mapper;
import tgkt.togastock.bean.Company;

import java.util.List;

@Mapper
public interface CompanyDao {
    Company getByID(int companyId);

    List<Company> getAllList();

    void insert(Company company);

    void update(Company company);
}
