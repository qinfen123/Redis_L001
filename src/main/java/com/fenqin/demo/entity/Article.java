package com.fenqin.demo.entity;

import lombok.Getter;
import lombok.Setter;
import sun.util.resources.ga.LocaleNames_ga;

/**
 * @ClassName: Article
 * @Description: 文章投票网站
 * @author: fenqin
 * @Date: 2019/7/21 22:22
 * @Version: 1.0
 */
@Getter
@Setter
public class Article {

    /** 文章标题*/
    private String title;
    /**指向文章的网址 */
    private String link;
    /**发布文章的用户 */
    private String poster;
    /** 文章的发布时间 */
    private Double time;
    /** 文章得到的投票数量 */
    private int votes;

    public Article() {
    }

    public Article(String title, String link, String poster, Double time, int votes) {
        this.title = title;
        this.link = link;
        this.poster = poster;
        this.time = time;
        this.votes = votes;
    }
}
