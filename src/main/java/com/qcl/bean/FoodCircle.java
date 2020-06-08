package com.qcl.bean;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author oygh
 * @date 2020/5/16 - 14:29
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class FoodCircle {
    @Id
    @GeneratedValue
    private int food_circle_id;
    private String openid;//微信中的openid
    private String name;//姓名
    private String avatarUrl;//头像
    private String imageUrl; //图片地址
    private String content;//描述内容

    @CreatedDate
    private Date crateDate;


}