package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI定量结果
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quantification_mri {
    private int id;
    private int mri_image_id;
    private double 大小;
    private double 体积;
    private double 数量;
    private double 包膜厚度;
    private int DWI_DC;//数据库中字段名 DWI-ADC
    private int DTI_ADC;//数据库中字段名 DTI-ADC
    private int DTI_FA;//数据库中字段名 DTI-FA
    private int DKI_MK;//数据库中字段名 DKI-MK
    private int DKI_Ka;//数据库中字段名 DKI-Ka
    private int DKI_Kr;//数据库中字段名 DKI-Kr
    private int DKI_FAK;//数据库中字段名 DKI-FAK
    private int DKI_MD;//数据库中字段名 DKI-MD
    private int DKI_Da;//数据库中字段名 DKI-Da
    private int DKI_Dr;//数据库中字段名 DKI-Dr
    private int DKI_FA;//数据库中字段名 DKI-FA
    private int IVIM_Standard;//数据库中字段名 IVIM-Standard
    private int IVIM_D_mono;//数据库中字段名 IVIM-D-mono
    private int IVIM_D$_mono;//数据库中字段名 IVIM-D*-mono
    private int IVIM_fmono;//数据库中字段名 IVIM-fmono
    private int IVIM_D_Bi;//数据库中字段名 IVIM-D-Bi
    private int IVIM_D$_Bi;//数据库中字段名 IVIM-D*-Bi
    private int IVIM_fBi;//数据库中字段名 IVIM-fBi
    private int IVIM_DDC;//数据库中字段名 IVIM-DDC
    private int IVIM_α;//数据库中字段名 IVIM-α
    private int ESWAN_R2$;//数据库中字段名 ESWAN-R2*
    private int ESWAN_T2$;//数据库中字段名 ESWAN-T2*
    private int ESWAN_相位值;//数据库中字段名 ESWAN-相位值
    private int ESWAN_幅度值;//数据库中字段名 ESWAN-幅度值
    private int IDIQ_R2;//数据库中字段名 IDIQ-R2
    private int IDIQ_脂肪分数;//数据库中字段名 IDIQ-脂肪分数
    private int MRS_胆碱;//数据库中字段名 MRS-胆碱
    private int MRS_肌酸;//数据库中字段名 MRS-肌酸
    private int MRS_枸橼酸盐;//数据库中字段名 MRS-枸橼酸盐
    private int APT_MTRasym;//数据库中字段名 APT-MTRasym
    private int mDIXON_Quant_R2;//数据库中字段名 mDIXON-Quant-R2
    private int mDIXON_Quant_脂肪分数;//数据库中字段名 mDIXON-Quant-脂肪分数
    private int T1_mapping_T1;//数据库中字段名 T1_mapping-T1
    private int T2_mapping_T2;//数据库中字段名 T2_mapping-T2
    private int DCE_Ktrans;//数据库中字段名 DCE-Ktrans
    private int DCE_Kep;//数据库中字段名 DCE-Kep
    private int DCE_Ve;//数据库中字段名 DCE-Ve
    private int DCE_Vp;//数据库中字段名 DCE-Vp
    private int DCE_MSI;//数据库中字段名 DCE-MSI
    private int DCE_TTP;//数据库中字段名 DCE-TTP
    private String other;
}
