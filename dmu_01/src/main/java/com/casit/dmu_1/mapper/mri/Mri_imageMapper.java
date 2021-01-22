package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Mri_image;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI影像持久层
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Mri_imageMapper {
    /**
     * 添加MRI影像
     * @param mri_image 需要添加的MRI影像
     * @return 更改的行数
     */
    int add(Mri_image mri_image);

    /**
     * 删除MRI影像
     * @param image_id 需要删除的MRI批次id
     * @return 更改的行数
     */
    int delete(@Param("image_id") int image_id);

    /**
     * 根据批次id查询影像id
     * @param record_id 批次id
     * @return 影像id
     */
    int query(int record_id);
}