package cn.harryai.test.helloworld.db;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MockDB {
    private static final Map<String, Object> mapDB = new HashMap<>();

    public static Map<String, Object> getMapDB() {
        return mapDB;
    }

    @PostConstruct
    private void init() {
        System.out.println("exec init!");
        mapDB.put("a", 1);
        mapDB.put("b", "harry");
    }

}
