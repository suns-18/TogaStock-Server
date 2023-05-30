package tgkt.togastock.service;

import org.apache.ibatis.session.SqlSession;
import tgkt.togastock.bean.Stock;
import tgkt.togastock.dao.StockDao;
import tgkt.togastock.dao.UserDao;
import tgkt.togastock.util.Database;

import java.util.List;

public class StockService {
    private static StockService instance;

    public static StockService getInstance() {
        if (instance == null) instance = new StockService();
        return instance;
    }

    public List<Stock> getAllList(){
        try (SqlSession session = Database.getInstance().openSession()) {
            var dao = session.getMapper(StockDao.class);
            return dao.getAllList();
        }
    }
}
