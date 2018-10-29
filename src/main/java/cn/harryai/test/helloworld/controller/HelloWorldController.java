package cn.harryai.test.helloworld.controller;

import cn.harryai.test.helloworld.service.DBService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {
    @Autowired
    DBService dbService;

    @GetMapping("hello")
    public String hello() {

        return "hello-world";
    }

    @GetMapping("get")
    @ResponseBody
    public String get() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "harry");
        map.put("age", 12);
        map.put("sex", 87);
        System.out.println(JSON.toJSONString(map));

        return JSONArray.toJSONString(map);
    }

    @GetMapping("get2")
    @ResponseBody
    public String get2(String s) {
        System.out.println(s);
        return dbService.findByKey(s).toString();

    }


}
