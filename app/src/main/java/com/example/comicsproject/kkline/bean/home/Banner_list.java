/**
  * Copyright 2023 bejson.com 
  */
package com.example.comicsproject.kkline.bean.home;

import com.example.comicsproject.kkline.bean.home.recommend.Banner_children;

import java.util.List;

/**
 * Auto-generated: 2023-01-25 21:40:55
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Banner_list {

    private Action_type action_type;
    private double aspect;
    private int countdown_percentage;
    private int dynamic_image_type;
    private int height;
    private long id;
    private String image;
    private String image_main_color;
    private int play_time;
    private String sub_title;
    private int sub_title_type;
    private Subtitle subtitle;
    private String title;
    private int width;
    private List<Banner_children> banner_children;

    public List<Banner_children> getBanner_children() {
        return banner_children;
    }

    public void setBanner_children(List<Banner_children> banner_children) {
        this.banner_children = banner_children;
    }

    public void setAction_type(Action_type action_type) {
         this.action_type = action_type;
     }
     public Action_type getAction_type() {
         return action_type;
     }

    public void setAspect(double aspect) {
         this.aspect = aspect;
     }
     public double getAspect() {
         return aspect;
     }

    public void setCountdown_percentage(int countdown_percentage) {
         this.countdown_percentage = countdown_percentage;
     }
     public int getCountdown_percentage() {
         return countdown_percentage;
     }

    public void setDynamic_image_type(int dynamic_image_type) {
         this.dynamic_image_type = dynamic_image_type;
     }
     public int getDynamic_image_type() {
         return dynamic_image_type;
     }

    public void setHeight(int height) {
         this.height = height;
     }
     public int getHeight() {
         return height;
     }

    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setImage(String image) {
         this.image = image;
     }
     public String getImage() {
         return image;
     }

    public void setImage_main_color(String image_main_color) {
         this.image_main_color = image_main_color;
     }
     public String getImage_main_color() {
         return image_main_color;
     }

    public void setPlay_time(int play_time) {
         this.play_time = play_time;
     }
     public int getPlay_time() {
         return play_time;
     }

    public void setSub_title(String sub_title) {
         this.sub_title = sub_title;
     }
     public String getSub_title() {
         return sub_title;
     }

    public void setSub_title_type(int sub_title_type) {
         this.sub_title_type = sub_title_type;
     }
     public int getSub_title_type() {
         return sub_title_type;
     }

    public void setSubtitle(Subtitle subtitle) {
         this.subtitle = subtitle;
     }
     public Subtitle getSubtitle() {
         return subtitle;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setWidth(int width) {
         this.width = width;
     }
     public int getWidth() {
         return width;
     }

}