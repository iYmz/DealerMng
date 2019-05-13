package com.bababadboy.dealermng.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * phone entity
 * @author iYmz
 *
 */

@Entity
@Table(name="phone_label")
public class Phone implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    //phone number
    @Column(nullable = false,unique = true)
    private String mobile;

    //phone detail
    @Column(nullable = false)
    private String info;

    //img?
    @Column(nullable = false)
    private String img;

    //the type of number like :ADS
    @Column(nullable = false)
    private String label;

    //mark eg:此号码近期被41位用户标记，疑似为快递送餐电话！
    @Column(nullable = false)
    private String mark;


    @Column(nullable = false)
    private int times;


    @Column(nullable = false)
    private String address;


    @Column(nullable = false,name = "category_id")
    private int categoryId;

    @Column(nullable = false,name = "category_item_id")
    private int categoryItemId;


    @Column(nullable = false)
    private Date gtime;


    @Column(nullable = false)
    private Date utime;


    public Phone() {
    }

    public Phone(String mobile, String info, String img, String label, String mark, int times, String address, int categoryId, int categoryItemId, Date gtime, Date utime) {
        this.mobile = mobile;
        this.info = info;
        this.img = img;
        this.label = label;
        this.mark = mark;
        this.times = times;
        this.address = address;
        this.categoryId = categoryId;
        this.categoryItemId = categoryItemId;
        this.gtime = gtime;
        this.utime = utime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCategoryItemId() {
        return categoryItemId;
    }

    public void setCategoryItemId(int categoryItemId) {
        this.categoryItemId = categoryItemId;
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }
}
