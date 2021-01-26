package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定量结果
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ct_Quantification {
    private int id;
    private int ct_image_id;
    private double 大小_长径;
    private double 大小_短径;
    private double 体积_总体积;
    private double 体积_强化体积;
    private int 数量;
    private int CT值;
    private int 动脉期;
    private int 门静脉期;
    private int 延迟期;
    private double 包膜厚度;
    private double 能谱CT_动脉期碘水值;//数据库中字段名 能谱CT-动脉期碘水值
    private double 能谱CT_门脉期碘水值;//数据库中字段名 能谱CT-门脉期碘水值
    private double 能谱CT_延迟期碘水值;//数据库中字段名 能谱CT-延迟期碘水值
    private int 能谱CT_平扫有效原子序数;//数据库中字段名 能谱CT-平扫有效原子序数
    private String 能谱CT_平扫能谱曲线类型;//数据库中字段名 能谱CT-平扫能谱曲线类型
    private double 能谱CT_平扫能谱曲线斜率;//数据库中字段名 能谱CT-平扫能谱曲线斜率
    private String 能谱CT_动脉期能谱曲线类型;//数据库中字段名 能谱CT-动脉期能谱曲线类型
    private double 能谱CT_动脉期能谱曲线斜率;//数据库中字段名 能谱CT-动脉期能谱曲线斜率
    private String 能谱CT_延迟期能谱曲线类型;//数据库中字段名 能谱CT-延迟期能谱曲线类型
    private double 能谱CT_延迟期能谱曲线斜率;//数据库中字段名 能谱CT-延迟期能谱曲线斜率
    private int 能谱CT_平扫40keV单能量CT值;//数据库中字段名 能谱CT-平扫40keV单能量CT值
    private int 能谱CT_平扫50keV单能量CT值;//数据库中字段名 能谱CT-平扫50keV单能量CT值
    private int 能谱CT_平扫60keV单能量CT值;//数据库中字段名 能谱CT-平扫60keV单能量CT值
    private int 能谱CT_平扫70keV单能量CT值;//数据库中字段名 能谱CT-平扫70keV单能量CT值
    private int 能谱CT_平扫80keV单能量CT值;//数据库中字段名 能谱CT-平扫80keV单能量CT值
    private int 能谱CT_平扫90keV单能量CT值;//数据库中字段名 能谱CT-平扫90keV单能量CT值
    private int 能谱CT_平扫100keV单能量CT值;//数据库中字段名 能谱CT-平扫100keV单能量CT值
    private int 能谱CT_平扫110keV单能量CT值;//数据库中字段名 能谱CT-平扫110keV单能量CT值
    private int 能谱CT_平扫120keV单能量CT值;//数据库中字段名 能谱CT-平扫120keV单能量CT值
    private int 能谱CT_平扫130keV单能量CT值;//数据库中字段名 能谱CT-平扫130keV单能量CT值
    private int 能谱CT_平扫140keV单能量CT值;//数据库中字段名 能谱CT-平扫140keV单能量CT值
    private int 能谱CT_动脉期40keV单能量CT值;//数据库中字段名 能谱CT-动脉期40keV单能量CT值
    private int 能谱CT_动脉期50keV单能量CT值;//数据库中字段名 能谱CT-动脉期50keV单能量CT值
    private int 能谱CT_动脉期60keV单能量CT值;//数据库中字段名 能谱CT-动脉期60keV单能量CT值
    private int 能谱CT_动脉期70keV单能量CT值;//数据库中字段名 能谱CT-动脉期70keV单能量CT值
    private int 能谱CT_动脉期80keV单能量CT值;//数据库中字段名 能谱CT-动脉期80keV单能量CT值
    private int 能谱CT_动脉期90keV单能量CT值;//数据库中字段名 能谱CT-动脉期90keV单能量CT值
    private int 能谱CT_动脉期100keV单能量CT值;//数据库中字段名 能谱CT-动脉期100keV单能量CT值
    private int 能谱CT_动脉期110keV单能量CT值;//数据库中字段名 能谱CT-动脉期110keV单能量CT值
    private int 能谱CT_动脉期120keV单能量CT值;//数据库中字段名 能谱CT-动脉期120keV单能量CT值
    private int 能谱CT_动脉期130keV单能量CT值;//数据库中字段名 能谱CT-动脉期130keV单能量CT值
    private int 能谱CT_动脉期140keV单能量CT值;//数据库中字段名 能谱CT-动脉期140keV单能量CT值
    private int 能谱CT_门脉期40keV单能量CT值;//数据库中字段名 能谱CT-门脉期40keV单能量CT值
    private int 能谱CT_门脉期50keV单能量CT值;//数据库中字段名 能谱CT-门脉期50keV单能量CT值
    private int 能谱CT_门脉期60keV单能量CT值;//数据库中字段名 能谱CT-门脉期60keV单能量CT值
    private int 能谱CT_门脉期70keV单能量CT值;//数据库中字段名 能谱CT-门脉期70keV单能量CT值
    private int 能谱CT_门脉期80keV单能量CT值;//数据库中字段名 能谱CT-门脉期80keV单能量CT值
    private int 能谱CT_门脉期90keV单能量CT值;//数据库中字段名 能谱CT-门脉期90keV单能量CT值
    private int 能谱CT_门脉期100keV单能量CT值;//数据库中字段名 能谱CT-门脉期100keV单能量CT值
    private int 能谱CT_门脉期110keV单能量CT值;//数据库中字段名 能谱CT-门脉期110keV单能量CT值
    private int 能谱CT_门脉期120keV单能量CT值;//数据库中字段名 能谱CT-门脉期120keV单能量CT值
    private int 能谱CT_门脉期130keV单能量CT值;//数据库中字段名 能谱CT-门脉期130keV单能量CT值
    private int 能谱CT_门脉期140keV单能量CT值;//数据库中字段名 能谱CT-门脉期140keV单能量CT值
    private int 能谱CT_延迟期40keV单能量CT值;//数据库中字段名 能谱CT-延迟期40keV单能量CT值
    private int 能谱CT_延迟期50keV单能量CT值;//数据库中字段名 能谱CT-延迟期50keV单能量CT值
    private int 能谱CT_延迟期60keV单能量CT值;//数据库中字段名 能谱CT-延迟期60keV单能量CT值
    private int 能谱CT_延迟期70keV单能量CT值;//数据库中字段名 能谱CT-延迟期70keV单能量CT值
    private int 能谱CT_延迟期80keV单能量CT值;//数据库中字段名 能谱CT-延迟期80keV单能量CT值
    private int 能谱CT_延迟期90keV单能量CT值;//数据库中字段名 能谱CT-延迟期90keV单能量CT值
    private int 能谱CT_延迟期100keV单能量CT值;//数据库中字段名 能谱CT-延迟期100keV单能量CT值
    private int 能谱CT_延迟期110keV单能量CT值;//数据库中字段名 能谱CT-延迟期110keV单能量CT值
    private int 能谱CT_延迟期120keV单能量CT值;//数据库中字段名 能谱CT-延迟期120keV单能量CT值
    private int 能谱CT_延迟期130keV单能量CT值;//数据库中字段名 能谱CT-延迟期130keV单能量CT值
    private int 能谱CT_延迟期140keV单能量CT值;//数据库中字段名 能谱CT-延迟期140keV单能量CT值
    private String other;
}
