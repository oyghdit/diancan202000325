package com.qcl.controller;

import com.qcl.api.ResultVO;
import com.qcl.bean.FoodCircle;
import com.qcl.meiju.ResultEnum;
import com.qcl.repository.FoodCircleRepository;
import com.qcl.utils.ApiUtil;
import com.qcl.yichang.DianCanException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author oygh
 * @date 2020/5/16 - 14:27
 */
@RestController
public class FoodCicleController {
    @Autowired
    private FoodCircleRepository repository;

    //美食圈页面呈现
    @GetMapping("/foodcircle")
    public ResultVO<FoodCircle> detail(
            @RequestParam("openid") String openid,
            @RequestParam("content") String content,
            //@RequestParam("food_circle_id") int food_circle_id,
            @RequestParam("name") String name,
            @RequestParam("imageUrl") String imageUrl,
            @RequestParam("avatarUrl") String avatarUrl
    ){
        if (StringUtils.isEmpty(openid) ){
            throw new DianCanException(ResultEnum.PARAM_ERROR);
        }
        //提交美食圈
        FoodCircle foodCircle = new FoodCircle();
        foodCircle.setOpenid(openid);
        foodCircle.setImageUrl(imageUrl);
        foodCircle.setAvatarUrl(avatarUrl);
        //foodCircle.setFood_circle_id(food_circle_id);
        foodCircle.setContent(content);
        foodCircle.setName(name);
        FoodCircle save = repository.save(foodCircle);
        return ApiUtil.success(save);
    }

    //查看美食圈
    @GetMapping("/seefoodcircle")
    public ResultVO<List<FoodCircle>> foodCircleList(){
        List<FoodCircle> all = repository.findAll();
        System.out.println(all);

        return ApiUtil.success(all);
    }
}

