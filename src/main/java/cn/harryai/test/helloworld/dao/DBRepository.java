package cn.harryai.test.helloworld.dao;

import cn.harryai.test.helloworld.db.MockDB;
import cn.harryai.test.helloworld.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class DBRepository {
    public Object findByKey(String s) {
        return MockDB.getMapDB().get(s);
    }

    public List<User> findByIds(List<String> ids) {
        List<User> usersList = new ArrayList<>();
        Map<String, User> usersMap = MockDB.getUsers();
        for (String id :
                ids) {
            usersList.add(usersMap.get(id));
        }
        return usersList;
    }

}
