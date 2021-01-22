package com.casit.dmu_1.service.serviceImpl;

import com.casit.dmu_1.mapper.mri.*;
import com.casit.dmu_1.pojo.mri.*;
import com.casit.dmu_1.service.MriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WangWeiQing
 * @version 1.0.0
 * @Description
 *      MRI影像业务层
 * @createTime 2020/12/23
 */

@Service
public class MriServiceImpl implements MriService {

    @Autowired
    Mri_recordMapper mri_recordMapper;
    @Autowired
    Mri_imageMapper mri_imageMapper;
    @Autowired
    Mri_scan_infoMapper mri_scan_infoMapper;
    @Autowired
    Mri_DefinitenessMapper mri_definitenessMapper;
    @Autowired
    Mri_QuantificationMapper mri_quantificationMapper;
    @Autowired
    MriMapper mriMapper;

    @Override
    @Transactional
    public int add(Mri mri) {
        //在数据库中添加一个新的批次并得到批次号
        Mri_record mri_record = new Mri_record();
        mri_recordMapper.add(mri_record);
        int mri_record_id=mri_record.getId();

        //模拟添加一个新的影像
        Mri_image mri_image = new Mri_image(0,1, mri_record_id);
        mri_imageMapper.add(mri_image);
        int mri_image_id=mri_image.getId();

        mri.mri_scan_info.setMri_record_id(mri_record_id);
        mri.mri_definiteness.setMri_image_id(mri_image_id);
        mri.mri_quantification.setMri_image_id(mri_image_id);

        //添加扫描信息
        mri_scan_infoMapper.add(mri.mri_scan_info);
        //添加定性结果
        mri_definitenessMapper.add(mri.mri_definiteness);
        //添加定量结果
        mri_quantificationMapper.add(mri.mri_quantification);
        return 1;
    }

    @Override
    @Transactional
    public int deleteMri_image(int image_id) {
        //删除图像
        mri_imageMapper.delete(image_id);
        //删除图像对应的定性、定量信息
        mri_definitenessMapper.delete(image_id);
        mri_quantificationMapper.delete(image_id);
        return 1;
    }

    @Override
    public List<Mri> quaryAll() {
        return mriMapper.quaryAll();
    }
}
