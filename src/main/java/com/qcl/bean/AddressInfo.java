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
 * @date 2020/5/14 - 22:02
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class AddressInfo {
    @Id
    @GeneratedValue  //id属性自动增长
    private int id;
    private String username;//用户名
    private String telephone;//电话
    private String address;//地址
    private String buildingnum;//楼栋信息
    private String number;//宿舍号
    @CreatedDate//自动添加创建时间的注解
    private Date createTime;


}
