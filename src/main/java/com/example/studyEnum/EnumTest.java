package com.example.studyEnum;

/**
 * @PackageName: com.example.studyEnum
 * @ClassName: EnumTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/26  10:53
 */
public class EnumTest {

    public void judge(SeasonEnum s){
        switch (s){
            case SPRING:
                System.out.println("春");
                break;
            case SUMMER:
                System.out.println("夏");
                break;
            case FALL:
                System.out.println("秋");
                break;
            case WINTER:
                System.out.println("冬");
                break;
        }
    }
    public static void main(String[] args) {
        for(SeasonEnum seasonEnum : SeasonEnum.values()){
            System.out.println(seasonEnum);
        }
        new EnumTest().judge(SeasonEnum.FALL);


        System.out.println(SeasonEnum.FALL.getName());
    }
}
