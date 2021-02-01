package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Mri_Quantification;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI定量结果
 * @createTime 2020/12/23
 */

@Mapper
public interface Quantification_mriMapper {
    /**
     * 添加MRI定量结果
     * @param mri_quantification 需要添加的MRI定量结果
     * @return 更改的行数
     */
    int addQuantification_mri(Mri_Quantification mri_quantification);

    /**
     * 删除MRI定量结果
     * @param image_id 需要删除的MRI定量结果影像id
     * @return 更改的行数
     */
    int deleteQuantification_mri(int image_id);
}
