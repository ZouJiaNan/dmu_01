package com.casit.dmu_1.mapper.ct;


import com.casit.dmu_1.pojo.ct.Ct_record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT批次持久层
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface Ct_recordMapper {
    /**
     * 添加CT批次
     * @param  ct_record 占位使用
     * @return 新增数据的id
     */
    int add_ct_record(Ct_record ct_record);

    /**
     * 删除CT批次
     * @param id 需要删除的CT批次id
     * @return 更改的行数
     */
    int deleteCt_record(int id);
}
