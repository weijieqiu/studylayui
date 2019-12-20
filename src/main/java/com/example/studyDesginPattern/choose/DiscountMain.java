package com.example.studyDesginPattern.choose;

/**
 * @PackageName: com.example.studyDesginPattern.choose
 * @ClassName: discountMain
 * @Description:
 * 一个电商系统，当用户消费满1000 金额，可以根据用户VIP等级，享受打折优惠。
 * 根据用户VIP等级，计算出用户最终的费用。
 *
 * 普通会员 不打折
 * 白银会员 优惠50元
 * 黄金会员 8折
 * 白金会员 优惠50元，再打7折
 * @author: qiuweijie
 * @date: 2019/12/18  14:46
 */
public class DiscountMain {
    public static void main(String[] args) {
        double monery = 100,resultMoney=0;
        String VIP = "白金会员";
        resultMoney = isOneOfVIP(VIP,monery);
        System.out.println(resultMoney);
    }


    /**
     * 普通会员 不打折
     * 白银会员 优惠50元
     * 黄金会员 8折
     * 白金会员 优惠50元，再打7折
     */
    private static double isOneOfVIP(String VIP,double monery) {
        if(Member.COMMON_VIP.equals(VIP)){
            return monery;
        }else if(Member.SLIVER_VIP.equals(VIP)){
            return  monery-50;
        }else if(Member.Gold_VIP.equals(VIP)){
            return monery * 0.8;
        }else if(Member.PLATINUM_VIP.equals(VIP)){
            return (monery-50)*0.7;
        }
        return 0;
    }
}
