package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT扫描信息
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
public class Ct_scan_info {
    private int id;
    private int ct_record_id;
    private String 型号;
    private double 管电压;
    private double 管电流;
    private double 探测器宽度;
    private String 重建算法;
    private String 扫描野;
    private double 转速;
    private String 螺旋;
    private double 层厚;
    private double 层间距;
    private double 重建层厚;
    private String 造影剂名称;
    private String 注射量;
    private String 流速;
    private String 增强三期扫描;
    private String other;
}
