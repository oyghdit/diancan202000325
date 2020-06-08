package com.qcl.controller;

import com.qcl.api.ResultVO;
import com.qcl.bean.AddressInfo;
import com.qcl.bean.Comment;
import com.qcl.meiju.ResultEnum;
import com.qcl.repository.AddressRepository;
import com.qcl.utils.ApiUtil;
import com.qcl.yichang.DianCanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author oygh
 * @date 2020/5/15 - 17:34
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;
    //收获地址信息
    @PostMapping("/save")
    public ResultVO<AddressInfo> save(@RequestParam("name") String name,
                                  @RequestParam("phone") String phone,
                                  @RequestParam("detail") String detail,
                                  @RequestParam("building") String building,
                                  @RequestParam("room") String room) {
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(phone)) {
            throw new DianCanException(ResultEnum.PARAM_ERROR);
        }

        //提交收获地址
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setUsername(name);
        addressInfo.setTelephone(phone);
        addressInfo.setAddress(detail);
        addressInfo.setBuildingnum(building);
        addressInfo.setNumber(room);
        AddressInfo save=addressRepository.save(addressInfo);
        return ApiUtil.success(save);

    }
    //查询所有地址
    @GetMapping("/addressList")
    public ResultVO<List<AddressInfo>> addressList() {
        List<AddressInfo> all = addressRepository.findAll();
        return ApiUtil.success(all);
    }
}
