package tgkt.togastock.service;

import org.apache.ibatis.session.SqlSession;
import tgkt.togastock.bean.Company;
import tgkt.togastock.bean.Stock;
import tgkt.togastock.dao.CompanyDao;
import tgkt.togastock.dao.StockDao;
import tgkt.togastock.util.Database;

import java.util.List;

public class CompanyService {
    private static CompanyService instance;
    public static CompanyService getInstance() {
        if (instance == null) instance = new CompanyService();
        return instance;
    }

    public List<Company> getAllList(){
        try (SqlSession session = Database.getInstance().openSession()) {
            var dao = session.getMapper(CompanyDao.class);
            return dao.getAllList();
        }
    }
}
