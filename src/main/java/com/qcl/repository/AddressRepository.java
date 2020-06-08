package com.qcl.repository;

import com.qcl.bean.AddressInfo;
import com.qcl.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author oygh
 * @date 2020/5/15 - 19:18
 */
//repository主要是对数据库进行增删改查操作
public interface AddressRepository extends JpaRepository<AddressInfo, Integer> {

}
