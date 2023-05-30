package tgkt.togastock.dao;

import tgkt.togastock.bean.Order;

import java.util.List;

public interface OrderDao {
    Order getByID(int orderNo);
    List<Order> getListByUserStock(int userId, int tsCode);
    List<Order> getAllList();
    void insert();
    void update();
}
