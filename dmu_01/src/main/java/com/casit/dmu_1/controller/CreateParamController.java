package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.mri.Mri_Definiteness;
import com.casit.dmu_1.pojo.mri.Mri;
import com.casit.dmu_1.pojo.mri.Mri_scan_info;
import com.casit.dmu_1.pojo.mri.Mri_Quantification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月19日 14:48:00
 */
@RequestMapping("create")
@RestController
public class CreateParamController {
    @RequestMapping("Mri")
    public Mri CreateMri(){
        Mri mri_add_bean=new Mri();
        Mri_scan_info mri_scan_info=new Mri_scan_info();
        Mri_Definiteness definiteness_mri=new Mri_Definiteness();
        Mri_Quantification quantification_mri=new Mri_Quantification();

        Field[] Mri_add_Bean_Fields= Mri.class.getDeclaredFields();
        for (Field field:Mri_add_Bean_Fields) {
            try {
                Field[] Child_Fields=Class.forName(field.getGenericType().getTypeName()).getDeclaredFields();
                for (Field Child_Field:Child_Fields) {
                    Child_Field.setAccessible(true);
                    if(field.getGenericType().equals(Mri_scan_info.class)){
                        if(field.getGenericType()==String.class) {
                            Child_Field.set(mri_scan_info, "test");
                        }
                        if(field.getGenericType()==int.class) {
                            Child_Field.set(mri_scan_info, 1);
                        }
                    }
                    if(field.getGenericType().equals(Mri_Definiteness.class)){
                        if(field.getGenericType()==String.class) {
                            Child_Field.set(definiteness_mri, "test");
                        }
                        if(field.getGenericType()==int.class) {
                            Child_Field.set(definiteness_mri, 1);
                        }
                    }
                    if(field.getGenericType().equals(Mri_Quantification.class)){
                        if(field.getGenericType()==String.class) {
                            Child_Field.set(quantification_mri, "test");
                        }
                        if(field.getGenericType()==int.class) {
                            Child_Field.set(quantification_mri, 1);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mri_add_bean.mri_scan_info=mri_scan_info;
        mri_add_bean.mri_definiteness=definiteness_mri;
        mri_add_bean.mri_quantification=quantification_mri;
        return mri_add_bean;
    }
}
