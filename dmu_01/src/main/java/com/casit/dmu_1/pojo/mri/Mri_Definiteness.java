package com.casit.dmu_1.pojo.mri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月01日 14:32:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mri_Definiteness {
    private int id;
    private int mri_image_id;
    private String station;
    private String main_liver;
    private String T1WI_signal;
    private String T2WI_signal;
    private String DWI_signal;
    private int strengthen_bm;
    private int BaoMoWanZhengXing;
    private int FeiQiangHuaBaoMo;
    private int LiuNeiChuXue;
    private int LiuNeiHuaiSi;
    private int LiuNeiZhiZhiChenJi;
    private int JingMaiXueShuanXingCheng;
    private int DongMaiQiGaoQiangHua;
    private int KuoQingBiaoXian;
    private int DongMaiQiFeiHuanZhuangGaoQiangHua;
    private int FeiZhouBianKuoQing;
    private int cirrhosis;
    private int LiuNeiDongMai;
    private String ZhongLiuBianYuan;
    private String ZhongLiuBianJie;
    private int  LiuZhouQiangHua;
    private int  YuZhiZengZhang;
    private int  YaYuZhiZengZhang;
    private int  JieZhongJieZheng;
    private int  MaSaiKeZheng;
    private String other;

}
