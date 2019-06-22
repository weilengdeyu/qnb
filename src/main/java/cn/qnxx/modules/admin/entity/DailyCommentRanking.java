package cn.qnxx.modules.admin.entity;

/**
 * @Classname DailyCommentRanking
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/20 10:11
 * @Created by Happy-微冷的雨
 */

import java.util.Date;

/**
 * 每天的关注排行
 */
public class DailyCommentRanking {
   private Integer id;
   private String brand;
   private Date date;
   private Integer comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }
}
