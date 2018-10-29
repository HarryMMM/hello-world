package cn.harryai.test.helloworld.service;

import cn.harryai.test.helloworld.dao.DBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    DBRepository repositoryDB;

    @Cacheable(value = "str", key = "#s")
    public Object findByKey(String s) {
        System.out.println("key:" + s + ",查库操作");
        return repositoryDB.findByKey(s);
    }
}
