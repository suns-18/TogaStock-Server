package tgkt.togastock.util;

import lombok.Getter;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class Database {
    private static Database instance;
    private static final String MYBATIS_CONFIG =
            "ags/edu/cu/oca/resource/mybatis-config.xml";

    public static Database getInstance() {
        if (instance == null) {
            try {
                instance = new Database();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return instance;
    }

    @Getter
    private final SqlSessionFactory sqlSessionFactory;

    private Database() throws IOException {
        this.sqlSessionFactory =
                new SqlSessionFactoryBuilder().
                        build(
                                Resources.getResourceAsStream(MYBATIS_CONFIG)
                        );
    }

    public SqlSession openSession() {
        return
                this.sqlSessionFactory
                        .openSession(true);
    }

    public SqlSession openSession(boolean autoCommit) {
        return
                this.sqlSessionFactory
                        .openSession(autoCommit);
    }

}
