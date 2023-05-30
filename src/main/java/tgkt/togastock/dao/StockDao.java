package tgkt.togastock.dao;

import org.apache.ibatis.annotations.Mapper;
import tgkt.togastock.bean.Stock;

import java.util.List;

@Mapper
public interface StockDao {
    Stock getByCode(String tsCode);
    Stock getBySymbol(String symbol);
    List<Stock> getListByName(String name);
    List<Stock> getListByIndustry(String industry);
    Stock getAllList();
}
