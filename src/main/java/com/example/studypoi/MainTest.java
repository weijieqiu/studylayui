package com.example.studypoi;

import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Author: Dreamer-1
 * Date: 2019-03-01
 * Time: 10:13
 * Description: 示例程序入口类
 */
public class MainTest {


    private static Logger logger = LoggerFactory.getLogger(MainTest.class.getName());

    public static void main(String[] args) {

        /************** 读取Excel流程 ******************/
        // 设定Excel文件所在路径
        String excelFileName = "./excelpoi/readExample.xlsx";
        // 读取Excel文件内容
        List<ExcelDataVO> readResult = ExcelReader.readExcel(excelFileName);
        for (ExcelDataVO readResult1 :readResult){
            logger.debug(readResult1.getName());
            logger.debug(readResult1.getJob());
            logger.debug(String.valueOf(readResult1.getAge()));
            logger.debug(readResult1.getLocation());
        }

        // todo 进行业务操作

        /************** 写入Excel流程 ******************/
        // 创建需要写入的数据列表
        List<ExcelDataVO> dataVOList = new ArrayList<>(2);
        ExcelDataVO dataVO = new ExcelDataVO();
        dataVO.setName("小明");
        dataVO.setAge(18);
        dataVO.setLocation("广州");
        dataVO.setJob("大学生");
        ExcelDataVO dataVO2 = new ExcelDataVO();
        dataVO2.setName("小花");
        dataVO2.setAge(19);
        dataVO2.setLocation("深圳");
        dataVO2.setJob("大学生");
        dataVOList.add(dataVO);
        dataVOList.add(dataVO2);

        // 写入数据到工作簿对象内
        Workbook workbook = ExcelWriter.exportData(dataVOList);

        // 以文件的形式输出工作簿对象
        FileOutputStream fileOut = null;
        try {
            String exportFilePath = "./excelpoi/writeExample.xlsx";
            File exportFile = new File(exportFilePath);
            if (!exportFile.exists()) {
                exportFile.createNewFile();
            }

            fileOut = new FileOutputStream(exportFilePath);
            workbook.write(fileOut);
            fileOut.flush();
        } catch (Exception e) {
            logger.debug("输出Excel时发生错误，错误原因：" + e.getMessage());
        } finally {
            try {
                if (null != fileOut) {
                    fileOut.close();
                }
                if (null != workbook) {
                    workbook.close();
                }
            } catch (IOException e) {
                logger.debug("关闭输出流时发生错误，错误原因：" + e.getMessage());
            }
        }

    }

}
