package tgkt.togastock.dao;

import org.apache.ibatis.annotations.Mapper;
import tgkt.togastock.bean.Account;

import java.util.List;

@Mapper
public interface AccountDao {
    Account getByID(int accountId);

    List<Account> getAllList();

    void insert(Account account);
    void update(Account account);
}
