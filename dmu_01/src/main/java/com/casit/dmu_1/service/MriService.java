package com.casit.dmu_1.service;


import com.casit.dmu_1.pojo.mri.*;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      由于批次、图像、扫描信息为一对一的关系，将MRI影像相关的增删操作合成一个接口
 * @createTime 2020/12/23
 */

public interface MriService {
    /**
     * 按批次添加
     * @param mri MRI扫描信息

     * @return 返回 1 表示添加成功
     */
    int add(Mri mri);

    /**
     * 删除单张图片
     * @param image_id 需要删除的CT批次id
     * @return 返回 1 表示删除成功
     */
    int deleteMri_image(int image_id);

    /**
     * 按批次删除
     * @return 返回 List
     */
    List<Mri> quaryAll();
}
