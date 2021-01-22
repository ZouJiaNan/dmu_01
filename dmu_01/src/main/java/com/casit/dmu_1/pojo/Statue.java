package com.casit.dmu_1.pojo;

import lombok.AllArgsConstructor;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description
 *      状态码
 * @createTime 15:11 2020/11/17
 */
@AllArgsConstructor
public enum Statue {
    SUCCESS(200,"请求成功");

    public int code;
    public String message;


}
