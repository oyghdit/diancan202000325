package com.qcl.request;

import lombok.Data;

/**
 * @author oygh
 * @date 2020/5/16 - 10:58
 */
@Data
public class AddressReq {
    private String username;//用户名
    private String telephone;//电话
    private String address;//地址
    private String buildingnum;//楼栋信息
    private String number;//宿舍号
}
