package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Definiteness_mri;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI定性结果
 * @createTime 2020/12/23
 */
@Mapper
public interface Definiteness_mriMapper {
    /**
     * 添加MRI定性结果
     * @param definiteness_mri 需要添加的MRI定性结果
     * @return 更改的行数
     */
    int addDefiniteness_mri(Definiteness_mri definiteness_mri);

    /**
     * 删除MRI定性结果
     * @param image_id 需要删除的MRI定性结果影像id
     * @return
     */
    int deleteDefiniteness_mri(int image_id);
}
