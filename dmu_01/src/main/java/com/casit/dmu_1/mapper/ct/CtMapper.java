package com.casit.dmu_1.mapper.ct;

import com.casit.dmu_1.pojo.ct.Ct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月20日 16:02:00
 */
@Mapper
@Repository
public interface CtMapper {
    List<Ct> findAll();
}
