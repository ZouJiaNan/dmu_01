package com.casit.dmu_1.mapper.mri;

import com.casit.dmu_1.pojo.mri.Mri;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月21日 14:22:00
 */
@Mapper
@Repository
public interface MriMapper {
    List<Mri> queryAll();
}
