package com.fenqin.demo.redis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @ClassName: RedisUtils
 * @Description:
 * @author: fenqin
 * @Date: 2019/6/30 22:05
 * @Version: 1.0
 */
@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * @Author fenqin
     * @Description 使用散列存储数据 hash
     * @Date 2019/7/21 22:08
     * @Param [key, value]
     * @return void
     **/
    public void addHashValue(String nameSpace,String key,String value){
        redisTemplate.opsForHash().put(nameSpace,key,value);
    }

    /**
     * @Author fenqin
     * @Description  移除指定的命名空间
     * @Date 2019/7/22 22:39
     * @Param [nameSpace]
     * @return void
     **/
    public void removeHashValue(String nameSpace,String key){
        redisTemplate.opsForHash().delete(nameSpace,key);
    }

    public void removeHashKeys(String nameSpace){
        Set<Object> hashKeys= this.getHashKeys(nameSpace);
        redisTemplate.opsForHash().delete(nameSpace,hashKeys.toArray());
    }



    public Set<Object> getHashKeys(String nameSpace){
         return redisTemplate.opsForHash().keys(nameSpace);
    }

    public List<Object> getHashValues(String nameSpace){
        return redisTemplate.opsForHash().values(nameSpace);
    }

}
