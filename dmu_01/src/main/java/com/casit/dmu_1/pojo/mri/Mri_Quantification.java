package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月01日 14:11:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mri_Quantification {
    private int id;
    private int mri_image_id;
    private double DaXiao;
    private double TiJi;
    private double mount;
    private double BaoMoHouDu;
    private int DWI_ADC;
    private int DTI_ADC;
    private int DTI_FA;
    private int DKI_MK;
    private int DKI_Ka;
    private int DKI_Kr;
    private int DKI_FAK;
    private int DKI_MD;
    private int DKI_Da;
    private int DKI_Dr;
    private int DKI_FA;
    private int IVIM_Standard;
    private int IVIM_D_mono;
    private int IVIM_D$_mono;
    private int IVIM_fmono;
    private int IVIM_D_Bi;
    private int IVIM_D$_Bi;
    private int IVIM_fBi;
    private int IVIM_DDC;
    private int IVIM_α;
    private int ESWAN_R2$;
    private int ESWAN_T2$;
    private int ESWAN_XiangWeiZhi;
    private int ESWAN_FuDuZhi;
    private int IDIQ_R2;
    private int IDIQ_ZhiFangFenShu;
    private int MRS_DanJian;
    private int MRS_JiSuan;
    private int MRS_GouYuanYanSuan;
    private int APT_MTRasym;
    private int mDIXON_Quant_R2;
    private int mDIXON_Quant_ZhiFangFenShu;
    private int T1_mapping_T1;
    private int T2_mapping_T2;
    private int DCE_Ktrans;
    private int DCE_Kep;
    private int DCE_Ve;
    private int DCE_Vp;
    private int DCE_MSI;
    private int DCE_TTP;
    private int other;

}
