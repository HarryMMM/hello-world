package cn.harryai.test.helloworld.cache;

import com.alibaba.fastjson.JSONObject;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.cache.interceptor.KeyGenerator;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class CacheKeyGenerator implements KeyGenerator {
    @Override
    public Object generate(Object target, Method method, Object... params) {
        Map<String, Object> map = new HashMap<>();
        map.put("target", target.getClass().toGenericString());
        map.put("method", method.getName());
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                map.put("params" + i, params);
            }

        }
        String keyStr = JSONObject.toJSONString(map);
        byte[] hash = null;
        String key;
        try {
            hash = MessageDigest.getInstance("MD5").digest(keyStr.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        key = MD5Encoder.encode(hash);
        System.out.println(key);
        return key;
    }
}
