package tgkt.togastock.dao;

import org.apache.ibatis.annotations.Mapper;
import tgkt.togastock.bean.User;

import java.util.List;

@Mapper
public interface UserDao {
    User getByID(int userId);
    User getByName(String name);
    List<User> getListByRole(String role);
    List<User> getAllList();
    User doLogin(String name, String password);


    void insert(User user);
    void update(User user);
    void delete(int userId);
}
