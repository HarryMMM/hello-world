package cn.harryai.test.helloworld.service;

import cn.harryai.test.helloworld.dao.DBRepository;
import cn.harryai.test.helloworld.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {
    @Autowired
    DBRepository repositoryDB;

    @Cacheable(value = "str", keyGenerator = "cacheKeyGenerator")
    public Object findByKey(String s) {
        System.out.println("key:" + s + ",查库操作");
        return repositoryDB.findByKey(s);
    }

    @Cacheable(value = "sss", keyGenerator = "cacheKeyGenerator")
    public List<User> findUserByIds(List<String> ids) {

        return repositoryDB.findByIds(ids);
    }
}
