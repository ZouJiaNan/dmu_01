package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Mri_scan_info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI扫描信息持久层
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Mri_scan_infoMapper {
    /**
     * 添加MRI扫描信息
     * @param mri_scan_info 需要添加的MRI扫描信息
     * @return 更改的行数
     */
    int add(Mri_scan_info mri_scan_info);

    /**
     * 删除MRI扫描信息
     * @param id 需要删除的MRI扫描信息id
     * @return 更改的行数
     */
    int delete(int id);
}
