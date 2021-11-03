package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import service.RedisUserService;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class RedisUserServiceImpl implements RedisUserService {
    /**
     * 主要业务代码是通过某个key得到值：
     * Redis中 不存在：进数据库查询
     *         存在：进Redis中查询
     */
    @Autowired
    @Resource(name = "redisTemplate")
    RedisTemplate<String,String> redisTemplate;

    @Override
    public String getString(String key) {
        ValueOperations<String,String> string=redisTemplate.opsForValue();//opsForValue是存储String数据的,opsForValue中提供了很多操作Redis的String类型的数据！！！

        // redisTemplate.opsForValue().set("cs1","cs数据1",1, TimeUnit.HOURS);  //设置存储数据并设置过期时间为1小时

        if (redisTemplate.hasKey(key)) {
            System.out.println("在Redis中取出并返回");
            return string.get(key);
        }else {
            String result="RedisTemplate的Value值";

            string.set(key,result);
            System.out.println("在数据库中取出并返回");
            return result;
        }
    }
}