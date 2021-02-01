package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT扫描信息
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ct_scan_info {
    private int id;
    private int ct_record_id;
    private String model;
    private double g_voltage;
    private double g_electric;
    private double detector_width;
    private String rebuild_algorithm;
    private String scan_y;
    private double speed;
    private String spiral;
    private double depth_of_level;
    private double space_of_level;
    private double rebuild_depth;
    private String contrast_medium;
    private String amount_of_inject;
    private String flows;
    private String strengthen_3th_scan;
    private String other;
}
