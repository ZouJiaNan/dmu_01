package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI扫描信息
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mri_scan_info {
    private int id;
    private int mri_record_id;
    private String mri_device_type;
    private String mri_field;
    private int T1_FSPGR;
    private int T1W1;
    private int water_AX_LAVA_FLEX_MASK;
    private int fs_T2WI;
    private int DWI;
    private int DTI;
    private int DKI;
    private int IVIM;
    private int ESWAN;
    private int IDEAL_IQ;
    private int MRS;
    private int API;
    private int mDIXON_Quant;//数据库中字段名 mDIXON-Quant
    private int T1_mapping;
    private int T2_mapping;
    private int LAVA;
    private int DCE_MRI;//数据库中字段名 DCE-MRI
    private String other;
}
