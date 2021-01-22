package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT影像
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
public class Ct_image {
    private int id;
    private int patient_id;
    /**
     * CT影像的批次号
     */
    private int ct_record_id;
}
