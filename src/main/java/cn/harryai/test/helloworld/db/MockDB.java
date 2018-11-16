package cn.harryai.test.helloworld.db;

import cn.harryai.test.helloworld.model.User;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MockDB {
    private static final Map<String, Object> mapDB = new HashMap<>();
    private static final Map<String, User> users = new HashMap<>();
    public static Map<String, Object> getMapDB() {
        return mapDB;
    }
    public static Map<String,User> getUsers(){return users;}
    @PostConstruct
    private void init() {
        System.out.println("exec init!");
        mapDB.put("a", 1);
        mapDB.put("b", "harry");


        users.put("001",new User(){{setId("001");setName("一号");}});
        users.put("002",new User(){{setId("002");setName("二号");}});
        users.put("003",new User(){{setId("003");setName("三号");}});
        users.put("004",new User(){{setId("004");setName("四号");}});
        users.put("005",new User(){{setId("005");setName("五号");}});
        users.put("006",new User(){{setId("006");setName("六号");}});
        users.put("007",new User(){{setId("007");setName("七号");}});
        users.put("008",new User(){{setId("008");setName("八号");}});
        users.put("009",new User(){{setId("009");setName("九号");}});
        users.put("010",new User(){{setId("010");setName("十号");}});
        users.put("011",new User(){{setId("011");setName("十一号");}});
        users.put("012",new User(){{setId("012");setName("十二号");}});
        users.put("013",new User(){{setId("013");setName("十三号");}});
        users.put("014",new User(){{setId("014");setName("十四号");}});
        users.put("015",new User(){{setId("015");setName("十五号");}});
    }

}
