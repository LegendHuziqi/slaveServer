package edu.tute.center_server.Bean.configretion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanConfiguration {

    private static Logger logger = LoggerFactory.getLogger(BeanConfiguration.class);


    @Bean
    public JedisPool redisPoolFactory() {
        JedisPool pool = null;
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        pool = new JedisPool(jedisPoolConfig, "127.0.0.1", 6379, 1000, null);
        return pool;
    }


}
