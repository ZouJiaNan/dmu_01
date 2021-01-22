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
            @ApiImplicitParam(name="ct_scan_info",value = "扫描信息"),
            @ApiImplicitParam(name="ct_definiteness",value = "定性结果"),
            @ApiImplicitParam(name="ct_quantification",value = "定量结果")
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
}
