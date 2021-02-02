package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.mri.Mri;
import com.casit.dmu_1.pojo.mri.Mri_Definiteness;
import com.casit.dmu_1.pojo.mri.Mri_Quantification;
import com.casit.dmu_1.pojo.mri.Mri_scan_info;

import java.lang.reflect.Field;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月02日 14:14:00
 */
public class test {
    /*static Mri method_01(){
        Mri mri=new Mri();
        Mri_scan_info mri_scan_info=new Mri_scan_info();
        Mri_Definiteness definiteness_mri=new Mri_Definiteness();
        Mri_Quantification quantification_mri=new Mri_Quantification();

        Field[] Mri_Fields= Mri.class.getDeclaredFields();
        for (Field field_01:Mri_Fields) {
            try {
                Field[] Child_Fields = Class.forName(field_01.getGenericType().getTypeName()).getDeclaredFields();
                for(Field field_02:Child_Fields){
                    if(field_02.getGenericType().equals(int.class)){
                        System.out.println(field_02);
                        field_02.set();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        mri.mri_scan_info=mri_scan_info;
        mri.mri_definiteness=definiteness_mri;
        mri.mri_quantification=quantification_mri;
        return mri;
    }
    public static void main(String[] args) {
        method_01();
    }*/
}
