package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import com.casit.dmu_1.pojo.mri.Mri;
import com.casit.dmu_1.service.MriService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI控制层
 * @createTime 2020/12/23
 */

@Api(description = "MRI影像接口")
@RestController
@RequestMapping("mri")
public class MriController {

    @Autowired
    MriService mriService;

    @ApiOperation(value = "增加MRI",notes = "增加MRI")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mri_scan_info",value = "扫描信息"),
            @ApiImplicitParam(name="definiteness_mri",value = "定性结果"),
            @ApiImplicitParam(name="quantification_mri",value = "定量结果")
    })
    @PostMapping("add")
    public ResultBean add(@RequestBody Mri mri){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, mriService.add(mri));
    }

    @ApiOperation(value = "删除MRI",notes = "删除MRI")
    @ApiImplicitParam(name="image_id",value = "需要删除的图片号")
    @GetMapping("delete_mri_image")
    public ResultBean deleteMri_image(@RequestParam(value = "image_id") int image_id){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, mriService.deleteMri_image(image_id));
    }

    @ApiOperation(value = "查找所有MRI信息",notes = "查找所有MRI信息")
    @GetMapping("quaryAll")
    public ResultBean quaryAll(){
        return new ResultBean<List>(Statue.SUCCESS.code,Statue.SUCCESS.message,mriService.quaryAll());
    }
}
