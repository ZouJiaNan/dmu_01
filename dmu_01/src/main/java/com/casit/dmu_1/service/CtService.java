package com.casit.dmu_1.service;

import com.casit.dmu_1.pojo.ct.Ct;
import com.casit.dmu_1.pojo.ct.Ct_scan_info;
import com.casit.dmu_1.pojo.ct.Ct_Definiteness;
import com.casit.dmu_1.pojo.ct.Ct_Quantification;
import com.casit.dmu_1.pojo.mri.Mri;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      由于批次、图像、扫描信息为一对一的关系，将CT影像相关的增删操作合成一个接口
 * @createTime 2020/12/23
 */

public interface CtService {
    /**
     * 按批次添加
     * @param ct CT信息
     * @return 返回 1 表示添加成功
     */
    int add(Ct ct);

    /**
     * 删除单张图片
     * @param record_id 需要删除的CT批次id
     * @return 返回 1 表示删除成功
     */
    int deleteCt_image(int record_id);

    /**
     * 查询所有
     * @return 返回 List
     */
    List<Ct> queryAll();
}
