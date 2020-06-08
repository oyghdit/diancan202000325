package com.qcl.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)

 */
@Data
public class LeimuVO {
    // 此注解用于属性上，作用是把该属性的名称序列化为另外一个名称，
    // 如把leimuName属性序列化为name
    @JsonProperty("name")
    private String leimuName;

    @JsonProperty("type")
    private Integer leimuType;

    @JsonProperty("foods")
    private List<FoodRes> foodResList;
}
