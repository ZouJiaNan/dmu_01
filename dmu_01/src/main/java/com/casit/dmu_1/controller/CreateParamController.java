package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.Patient;
import com.casit.dmu_1.pojo.ct.Ct;
import com.casit.dmu_1.pojo.ct.Ct_Definiteness;
import com.casit.dmu_1.pojo.ct.Ct_Quantification;
import com.casit.dmu_1.pojo.ct.Ct_scan_info;
import com.casit.dmu_1.pojo.mri.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月19日 14:48:00
 */
@Api(description = "生成参数接口")
@RequestMapping("create")
@RestController
public class CreateParamController {
    @ApiOperation(value = "生成Mri参数",notes = "生成Mri参数")
    @GetMapping("Mri")
    public Mri CreateMri(){
        Mri mri=new Mri();
        Patient patient=new Patient();
        Mri_scan_info mri_scan_info=new Mri_scan_info();
        Mri_Definiteness definiteness_mri=new Mri_Definiteness();
        Mri_Quantification quantification_mri=new Mri_Quantification();

        Field[] Mri_Fields= Mri.class.getDeclaredFields();
        for (Field field:Mri_Fields) {
            try {
                Field[] Child_Fields=Class.forName(field.getGenericType().getTypeName()).getDeclaredFields();
                for (Field Child_Field:Child_Fields) {
                    Child_Field.setAccessible(true);
                    if(field.getGenericType().equals(Patient.class)){
                        if(Child_Field.getGenericType().equals(String.class)) {
                            Child_Field.set(patient, "test");
                        }
                        if(Child_Field.getGenericType().equals(int.class)) {
                            Child_Field.set(patient, 1);
                        }
                    }
                    if(field.getGenericType().equals(Mri_scan_info.class)){
                        if(Child_Field.getGenericType().equals(String.class)) {
                            Child_Field.set(mri_scan_info, "test");
                        }
                        if(Child_Field.getGenericType().equals(int.class)) {
                            Child_Field.set(mri_scan_info, 1);
                        }
                    }
                    if(field.getGenericType().equals(Mri_Definiteness.class)){
                        if(Child_Field.getGenericType().equals(String.class)) {
                            Child_Field.set(definiteness_mri, "test");
                        }
                        if(Child_Field.getGenericType().equals(int.class)) {
                            Child_Field.set(definiteness_mri, 1);
                        }
                    }
                    if(field.getGenericType().equals(Mri_Quantification.class)){
                        if(Child_Field.getGenericType().equals(String.class)) {
                            Child_Field.set(quantification_mri, "test");
                        }
                        if(Child_Field.getGenericType().equals(int.class)) {
                            Child_Field.set(quantification_mri, 1);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mri.mri_scan_info=mri_scan_info;
        mri.mri_definiteness=definiteness_mri;
        mri.mri_quantification=quantification_mri;
        mri.patient=patient;
        return mri;
    }

    @ApiOperation(value = "生成Ct参数",notes = "生成Ct参数")
    @GetMapping("Ct")
    public Ct CreateCt(){
        Ct ct=new Ct();
        Patient patient=new Patient();
        Ct_scan_info ct_scan_info=new Ct_scan_info();
        Ct_Definiteness ct_definiteness=new Ct_Definiteness();
        Ct_Quantification ct_quantification=new Ct_Quantification();

        Field[] ct_Fields= Ct.class.getDeclaredFields();
        for (Field field:ct_Fields) {
            try {
                Field[] Child_Fields=Class.forName(field.getGenericType().getTypeName()).getDeclaredFields();
                for (Field Child_Field:Child_Fields) {
                    Child_Field.setAccessible(true);
                    if(field.getGenericType().equals(Patient.class)){
                        if(Child_Field.getGenericType().equals(String.class)) {
                            Child_Field.set(patient, "test");
                        }
                        if(Child_Field.getGenericType().equals(int.class)) {
                            Child_Field.set(patient, 1);
                        }
                    }
                    if(field.getGenericType().equals(Ct_scan_info.class)){
                        if(Child_Field.getGenericType()==String.class) {
                            Child_Field.set(ct_scan_info, "test");
                        }
                        if(Child_Field.getGenericType()==int.class) {
                            Child_Field.set(ct_scan_info, 1);
                        }
                    }
                    if(field.getGenericType().equals(Ct_Definiteness.class)){
                        if(Child_Field.getGenericType()==String.class) {
                            Child_Field.set(ct_definiteness, "test");
                        }
                        if(Child_Field.getGenericType()==int.class) {
                            Child_Field.set(ct_definiteness, 1);
                        }
                    }
                    if(field.getGenericType().equals(Ct_Quantification.class)){
                        if(Child_Field.getGenericType()==String.class) {
                            Child_Field.set(ct_quantification, "test");
                        }
                        if(Child_Field.getGenericType()==int.class) {
                            Child_Field.set(ct_quantification, 1);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ct.ct_scan_info=ct_scan_info;
        ct.ct_definiteness=ct_definiteness;
        ct.ct_quantification=ct_quantification;
        ct.patient=patient;
        return ct;
    }
}
