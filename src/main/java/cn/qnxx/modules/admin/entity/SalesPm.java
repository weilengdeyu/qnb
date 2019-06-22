package cn.qnxx.modules.admin.entity;

import java.util.Date;

/**
 * @Classname SalesPm
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/18 14:02
 * @Created by Happy-微冷的雨
 */
public class SalesPm {
    private Integer id;
    private String name;
    private Integer num;
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
