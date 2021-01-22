package com.casit.dmu_1.pojo.ct;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定性结果
 * @createTime 2020/12/22
 */
@Data
@AllArgsConstructor
public class Ct_Definiteness {
    private int id;
    private int ct_image_id;
    private String 位置;
    private String 主要肝段;
    private String 平扫密度;
    private int 强化包膜;
    private int 包膜完整性;
    private int 非强化包膜;
    private int 瘤内出血;
    private int 瘤内坏死;
    private int 瘤内脂质沉积;
    private int 静脉血栓形成;
    private int 动脉期高强化;
    private int 廓清表现;
    private int 动脉期非环状高强化;
    private int 非周边廓清;
    private int 肝硬化;
    private int 瘤内动脉;
    private String 肿瘤边缘;
    private String 肿瘤边界;
    private int 瘤周强化;
    private int 阈值增长;
    private int 亚阈值增长;
    private int 结中结征;
    private int 马赛克征;
    private String other;

}
