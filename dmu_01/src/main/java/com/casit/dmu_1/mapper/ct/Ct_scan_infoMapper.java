package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Ct_scan_info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT扫描信息持久层
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Ct_scan_infoMapper {
    /**
     * 添加CT扫描信息
     * @param ct_scan_info 需要添加的CT扫描信息
     * @return 更改的行数
     */
    int add(Ct_scan_info ct_scan_info);

    /**
     * 删除CT扫描信息
     * @param id 需要删除的CT扫描信息id
     * @return 更改的行数
     */
    int delete(int id);
}
