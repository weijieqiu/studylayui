package com.example.studyothers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @PackageName: com.example.studyothers
 * @ClassName: LocalDateTimeTest
 * @Description: 小测一下 LocalDateTime 的使用
 * @author: qiuweijie
 * @date: 2019/12/26  11:27
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        // 1. 获得当前时间 -- result: 2019-12-26T11:30:11.024
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 2. 获取年、月、日、时、分、秒
        // -- 2.1 先指定一个时间
        LocalDateTime now1 = LocalDateTime.of(2019, 12, 26, 12, 12, 12);
        // -- 2.2 获取这个指定日期的时分秒
        int year = now1.getYear();
        int month = now1.getMonthValue();
        int day = now1.getDayOfMonth();
        int hours = now1.getHour();
        int minutes = now1.getMinute();
        int minute = now1.getMinute();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("年：").append(year).append("月: ").append(month).append("日: ").append(day).append("时: ")
                .append(hours).append("分: ").append(minutes).append("秒: ").append(minute);
        System.out.println(stringBuilder);

        // 3. 日期格式化
        LocalDateTime now3 = LocalDateTime.now();
        //LocalDateTime 类型的使用DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(formatter.format(now3));

        // 4.日期反解析
        String strDate = "2019-12--14 12:12:12";
        LocalDateTime reverseData = LocalDateTime.parse(strDate, DateTimeFormatter.ofPattern("yyyy-MM--dd HH:mm:ss"));
        System.out.println(reverseData);

    }
}
