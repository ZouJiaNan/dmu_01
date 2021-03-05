package com.casit.dmu_1.mapper;

import com.casit.dmu_1.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      病患持久层
 * @createTime 2020/12/23
 */

@Mapper
@Repository
public interface PatientMapper {
    /**
     * 添加病患
     * @param patient 病患对象
     * @return 更改的行数
     */
    int addPatient(Patient patient);

    /**
     * 根据id删除病患
     * @param patient_id 需要删除的病患id
     * @return 更改的行数
     */
    int deletePatient(@Param("patient_id") int patient_id);

    List<Patient> queryAll();
}
