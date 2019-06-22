package cn.qnxx.modules.admin.entity;

/**
 * @Classname Effect
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/20 18:54
 * @Created by Happy-微冷的雨
 */

import java.util.Date;

/**
 * 偏好
 */
public class Effect {
   private Integer id;
   private String ename;
   private Integer percentage;
   private Integer ptype;
   private Date date;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getEname() {
      return ename;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }

   public Integer getPercentage() {
      return percentage;
   }

   public void setPercentage(Integer percentage) {
      this.percentage = percentage;
   }

   public Integer getPtype() {
      return ptype;
   }

   public void setPtype(Integer ptype) {
      this.ptype = ptype;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }
}
