package com.casit.dmu_1.service.serviceImpl;

import com.casit.dmu_1.mapper.PatientMapper;
import com.casit.dmu_1.pojo.Patient;
import com.casit.dmu_1.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      病患业务层
 * @createTime 2020/12/23
 */

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientMapper patientMapper;

    @Override
    public int addPatient(Patient patient) {
        return patientMapper.addPatient(patient);
    }

    @Override
    public int deletePatient(int id) {
        return patientMapper.deletePatient(id);
    }

    @Override
    public List<Patient> queryAll() {
        return patientMapper.queryAll();
    }
}
