package com.casit.dmu_1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月20日 16:03:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    private int PageNumber;
    private int PageSize;
}
