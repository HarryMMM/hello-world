package cn.harryai.test.helloworld.cache;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class CacheConfig {
    @Bean
    public CacheKeyGenerator cacheKeyGenerator(){
        return new CacheKeyGenerator();
    }
}
