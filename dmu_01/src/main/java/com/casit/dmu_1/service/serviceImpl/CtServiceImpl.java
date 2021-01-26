package com.casit.dmu_1.service.serviceImpl;

import com.casit.dmu_1.mapper.ct.*;
import com.casit.dmu_1.pojo.ct.*;
import com.casit.dmu_1.pojo.mri.Mri;
import com.casit.dmu_1.service.CtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      CT影像业务层
 * @createTime 2020/12/23
 */

@Service
@Transactional
public class CtServiceImpl implements CtService {

    @Autowired
    Ct_recordMapper ct_recordMapper;
    @Autowired
    Ct_imageMapper ct_imageMapper;
    @Autowired
    Ct_scan_infoMapper ct_scan_infoMapper;
    @Autowired
    Ct_DefinitenessMapper definiteness_ctMapper;
    @Autowired
    Ct_QuantificationMapper quantification_ctMapper;
    @Autowired
    CtMapper ctMapper;

    @Override
    @Transactional
    public int add(Ct ct) {
        //在数据库中添加一个新的批次并获取批次号
        Ct_record ct_record=new Ct_record();
        ct_recordMapper.add_ct_record(ct_record);
        int ct_record_id=ct_record.getId();

        //模拟添加一个新的影像并获取影像号(此处留给OSS插入)
        Ct_image ct_image = new Ct_image(0, 1,ct_record.getId());
        ct_imageMapper.add(ct_image);
        int ct_image_id=ct_image.getId();

        //为扫描信息设置mri批次编号
        ct.ct_scan_info.setCt_record_id(ct_record_id);
        //为mri定性、定量信息设置图片编号
        ct.ct_definiteness.setCt_image_id(ct_image_id);
        ct.ct_quantification.setCt_image_id(ct_image_id);

        //添加扫描信息
        ct_scan_infoMapper.add(ct.ct_scan_info);
        //添加定性结果
        definiteness_ctMapper.add(ct.ct_definiteness);
        //添加定量结果
        quantification_ctMapper.add(ct.ct_quantification);
        return 1;
    }

    @Override
    @Transactional
    public int deleteCt_image(int image_id) {
        //删除图像
        ct_imageMapper.delete(image_id);
        //删除图像相关的定量、定性信息
        definiteness_ctMapper.delete(image_id);
        quantification_ctMapper.delete(image_id);
        return 1;
    }

    @Override
    public List<Ct> queryAll() {
        return ctMapper.queryAll();
    }
}
