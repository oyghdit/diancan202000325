package com.qcl.utils;

import com.qcl.meiju.CodeNumEnum;

/**
 *
 */
public class EnumUtil {

    /*
    * 获取枚举里的code值
    * */
    public static <T extends CodeNumEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
