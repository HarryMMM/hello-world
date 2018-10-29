package cn.harryai.test.helloworld.dao;

import cn.harryai.test.helloworld.db.MockDB;
import org.springframework.stereotype.Component;

@Component
public class DBRepository {
    public Object findByKey(String s) {
        return MockDB.getMapDB().get(s);
    }
}
