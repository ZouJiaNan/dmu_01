package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.casit.dmu_1.pojo.Patient;
/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月19日 14:44:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mri {
    public Patient patient;
    public Mri_image mri_image;
    public Mri_record mri_record;
    public Mri_scan_info mri_scan_info;
    public Mri_Definiteness mri_definiteness;
    public Mri_Quantification mri_quantification;
}
