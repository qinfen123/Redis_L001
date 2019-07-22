package com.fenqin.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @ClassName: Test
 * @Description:
 * @author: fenqin
 * @Date: 2019/3/23 22:32
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("a");
        lst.add("b");
        lst.add("a");
        lst.add("c");
        lst.add("a");
        //去重
        System.out.println(new ArrayList<>(new LinkedHashSet<>(lst)));
    }

}
