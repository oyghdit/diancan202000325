package com.qcl.repository;

import com.qcl.bean.FoodCircle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author oygh
 * @date 2020/5/16 - 14:33
 */

public interface FoodCircleRepository extends JpaRepository<FoodCircle,Integer> {
    List<FoodCircle> findAllByOpenid(String openid);
//    List<FoodCircle> findByImageUrl(String image_url);
}