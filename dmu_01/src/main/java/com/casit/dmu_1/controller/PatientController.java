package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.Patient;
import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import com.casit.dmu_1.service.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      病患控制层
 * @createTime 2020/12/23
 */

@Api(description = "病患操作接口")
@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @ApiOperation(value = "增加病患",notes = "增加病患")
    @ApiImplicitParam(name="patient",value = "新增病患")
    @PostMapping("add")
    public ResultBean add(@RequestBody Patient patient){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, patientService.addPatient(patient));
    }

    @ApiOperation(value = "删除病患",notes = "删除病患")
    @ApiImplicitParam(name="id",value = "需要删除病患的id")
    @GetMapping("delete")
    public ResultBean delete(@RequestParam(value = "id") int id){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, patientService.deletePatient(id));
    }
}
