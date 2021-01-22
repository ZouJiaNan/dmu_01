package com.casit.dmu_1.util;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.io.DicomInputStream;
import org.dcm4che3.tool.dcm2jpg.Dcm2Jpg;

import java.io.EOFException;
import java.io.File;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年12月29日 14:37:00
 */
public class dicomeUtil {
    //获取所有属性
    public static Attributes getAttributes(File file) {
        Attributes attr;
        try (DicomInputStream dis = new DicomInputStream(file)) {
            try {
                attr = dis.readDataset(-1, -1);
            } catch (EOFException eof) {
                dis.setIncludeBulkData(DicomInputStream.IncludeBulkData.URI);
                attr = dis.readDataset(-1, -1);
            }
        } catch (Exception e) {
            System.out.println("获取 Attributes 失败！");
            return null;
        }
        String defCharacter = attr.getString(Tag.SpecificCharacterSet);

        //设置编码格式，否则可能或出现乱码
        attr.setString(Tag.SpecificCharacterSet, VR.PN, "GB18030");
        attr.setString(Tag.SpecificCharacterSet, VR.CS, "GB18030");

        return attr;
    }

    //dicome转JPG
    public static File dcm2Jpg(File dcmFile, File folderFile) throws Exception {
        try {
            Dcm2Jpg dcm2Jpg = new Dcm2Jpg();
            dcm2Jpg.initImageWriter("JPEG", null, "com.sun.imageio.plugins.*", null, 1.0);
            String imagePath = folderFile.getAbsolutePath() + "\\aa.jpg";
            File imageFile = new File(imagePath);
            dcm2Jpg.convert(dcmFile, imageFile);
            return imageFile;
        } catch (Exception e) {
            throw new Exception("dcm2jpg 转 JPG 失败！");
        }
    }
}
