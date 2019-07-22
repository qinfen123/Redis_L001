package com.fenqin.demo;

import cn.hutool.json.JSONUtil;
import com.fenqin.demo.entity.Article;
import com.fenqin.demo.redis.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    private RedisUtils redisUtils;

    /**
     * @Author fenqin
     * @Description  使用
     * @Date 2019/7/22 22:28
     * @Param []
     * @return void
     **/
    @Test
    public void setHashValue() {
        String nameSpace="article";
        Set<Object> hashKeys = redisUtils.getHashKeys(nameSpace);
        logger.info("获取namespace=article中所有的keys: " +JSONUtil.toJsonStr(hashKeys));
        List<Object> hashValues = redisUtils.getHashValues(nameSpace);
        logger.info("获取namespace=article中所有的values: " +JSONUtil.toJsonStr(hashValues));

        logger.info("移除namspace=article中所有的keys");
        redisUtils.removeHashKeys(nameSpace);
        Article article = new Article("Go to statement considered harmful","http://goo.gl/kZUSu",
                "user:83271",1331382699.33,528);
        String jsonStr = JSONUtil.toJsonStr(article);

        redisUtils.addHashValue("article","92617",jsonStr);
        logger.info("[再次存放文章ID为key的散列存储。。。]");
        logger.info("获取namespace=article中所有的keys: " +JSONUtil.toJsonStr(hashKeys));
        logger.info("获取namespace=article中所有的values: " +JSONUtil.toJsonStr(hashValues));
    }

}
