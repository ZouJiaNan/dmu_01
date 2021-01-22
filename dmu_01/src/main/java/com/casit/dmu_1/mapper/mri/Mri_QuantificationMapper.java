package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Mri_Quantification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI定量结果
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Mri_QuantificationMapper {
    /**
     * 添加MRI定量结果
     * @param quantification_mri 需要添加的MRI定量结果
     * @return 更改的行数
     */
    int add(Mri_Quantification quantification_mri);

    /**
     * 删除MRI定量结果
     * @param image_id 需要删除的MRI定量结果影像id
     * @return 更改的行数
     */
    int delete(@Param("image_id") int image_id);
}
