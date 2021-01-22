package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI影像
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mri_image {
    private int id;
    /**
     * 病人编号
     */
    private int patient_id;
    /**
     * MRI影像的批次号
     */
    private int mri_record_id;
}
