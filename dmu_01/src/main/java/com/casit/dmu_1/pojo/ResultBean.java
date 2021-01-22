package com.casit.dmu_1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description
 *      统一返回值对象
 * @createTime 15:11 2020/11/17
 */

@Data
@AllArgsConstructor
public class ResultBean<T> {
    private int code;
    private String message;
    private T data;
}
