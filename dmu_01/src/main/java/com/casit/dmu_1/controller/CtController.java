package com.casit.dmu_1.controller;

import com.casit.dmu_1.pojo.ResultBean;
import com.casit.dmu_1.pojo.Statue;
import com.casit.dmu_1.pojo.ct.Ct;
import com.casit.dmu_1.service.CtService;
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
 *      CT控制层
 * @createTime 2020/12/23
 */

@Api(description = "CT影像接口")
@RestController
@RequestMapping("ct")
public class CtController {

    @Autowired
    CtService ctService;

    @ApiOperation(value = "增加CT",notes = "增加CT")
    @ApiImplicitParams({
            @ApiImplicitParam(name="ct",value = "ct信息"),
    })
    @PostMapping("add")
    public ResultBean add(@RequestBody Ct ct){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, ctService.add(ct));
    }

    @ApiOperation(value = "删除CT图像",notes = "删除CT图像")
    @ApiImplicitParam(name="image_id",value = "需要删除的图像id")
    @GetMapping("delete_ct_image")
    public ResultBean deleteCt_image(@RequestParam(value = "image_id") int image_id){
        return new ResultBean<Integer>(Statue.SUCCESS.code, Statue.SUCCESS.message, ctService.deleteCt_image(image_id));
    }

    @ApiOperation(value = "查找所有CT信息",notes = "查找所有Ct信息")
    @GetMapping("queryAll")
    public ResultBean queryAll(int patient_id){
        return new ResultBean<List>(Statue.SUCCESS.code,Statue.SUCCESS.message,ctService.queryAll(patient_id));
    }
}
