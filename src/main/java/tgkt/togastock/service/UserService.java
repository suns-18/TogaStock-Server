package tgkt.togastock.service;

import org.apache.ibatis.session.SqlSession;
import tgkt.togastock.bean.User;
import tgkt.togastock.dao.UserDao;
import tgkt.togastock.util.Database;

import java.util.List;

public class UserService {
    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User getUserByID(int ID) {
        try (SqlSession session = Database.getInstance().openSession()) {
            var userDao = session.getMapper(UserDao.class);
            var u = userDao.getByID(ID);

            if (u == null) return null;

            u.setPassword("");
            return u;
        }
    }

    public User login(String uName, String password) {
        try (SqlSession sqlSession = Database.getInstance().openSession()) {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User u = userDao.getByName(uName);

            if (u == null)
                return null;
            /*
            if (BCrypt.checkpw(password, u.getPassword())) {
                u.setPassword(null);
                return u;
            } else
                return null;*/

            if (password.equals(u.getPassword())) {
                u.setPassword(null);
                return u;
            } else
                return null;
        }
    }

    public List<User> getUsers() {
        try (var session = Database.getInstance().openSession()) {
            var userDao = session.getMapper(UserDao.class);
            return userDao.getAllList().stream().peek(
                    u -> u.setPassword("")
            ).toList();
        }
    }
}
