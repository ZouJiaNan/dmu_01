package com.casit.dmu_1.service;

import com.casit.dmu_1.pojo.Patient;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *
 * @createTime 2020/12/22
 */

public interface PatientService {
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
    int deletePatient(int patient_id);

    List<Patient> queryAll();
}
