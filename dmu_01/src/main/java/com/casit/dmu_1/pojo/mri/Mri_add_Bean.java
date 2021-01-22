package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月19日 14:44:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mri_add_Bean {
    public Mri_scan_info mri_scan_info;
    public Definiteness_mri definiteness_mri;
    public Quantification_mri quantification_mri;
}
