package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Mri_record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI批次持久层
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Mri_recordMapper {
    /**
     * 添加MRI批次
     * @param mri_record 需要添加的MRI批次
     * @return 更改的行数
     */
    int add(Mri_record mri_record);

    /**
     * 删除MRI批次
     * @param id 需要删除的MRI批次id
     * @return 更改的行数
     */
    int delete(int id);
}
