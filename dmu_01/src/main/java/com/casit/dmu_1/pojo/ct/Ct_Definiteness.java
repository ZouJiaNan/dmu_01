package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定性结果
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ct_Definiteness {
    private int id;
    private int ct_image_id;
    private String station;
    private String main_liver;
    private String scan_density;
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
    private int LiuZhouQiangHua;
    private int YuZhiZengZhang;
    private int YaYuZhiZengZhang;
    private int JieZhongJieZheng;
    private int MaSaiKeZheng;
    private String other;

}
