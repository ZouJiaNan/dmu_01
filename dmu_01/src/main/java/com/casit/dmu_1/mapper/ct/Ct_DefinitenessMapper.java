package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Ct_Definiteness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT定性结果
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Ct_DefinitenessMapper {
    /**
     * 添加CT定性结果
     * @param ct_definiteness 需要添加的CT定性结果
     * @return 更改的行数
     */
    int add(Ct_Definiteness ct_definiteness);

    /**
     * 删除CT定性结果
     * @param image_id 需要删除的CT定性结果的影像id
     * @return
     */
    int delete(int image_id);
}
