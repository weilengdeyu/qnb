package cn.qnxx.modules.admin.entity;

/**
 * @Classname SalesOneHourse
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/20 10:29
 * @Created by Happy-微冷的雨
 */

import java.util.Date;

/**
 * 每天的高峰消费时段，显示每天的交易量和交易额
 * 1：10  1000
 * 2：20  2000
 * 3：30  3000
 */
public class SalesOneHourse {
    private Integer id; //编号
    private Date date; //日期
    private Integer timeslot; //时间段
    private Integer numberoftransactions; //交易数量
    private Double turnover;  //成交额度

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Integer timeslot) {
        this.timeslot = timeslot;
    }

    public Integer getNumberoftransactions() {
        return numberoftransactions;
    }

    public void setNumberoftransactions(Integer numberoftransactions) {
        this.numberoftransactions = numberoftransactions;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }
}
