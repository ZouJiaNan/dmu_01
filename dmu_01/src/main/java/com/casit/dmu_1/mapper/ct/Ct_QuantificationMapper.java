package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Ct_Quantification;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定量结果
 * @createTime 2020/12/23
 */
@Mapper
@Repository
public interface Ct_QuantificationMapper {
    /**
     * 添加CT定量结果
     * @param ct_quantification 需要添加的CT定量结果
     * @return 更改的行数
     */
    int add(Ct_Quantification ct_quantification);

    /**
     * 删除CT定量结果
     * @param image_id 需要删除的CT定量结果影像id
     * @return 更改的行数
     */
    int delete(int image_id);
}
