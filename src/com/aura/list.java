package com.aura;

public class list {

	public static void main(String[] args) {
		String macBrand="MacBookAir";
        double macSize=13.3;
        double macPrice=1313.32;
        int macCount=2;
        
        String thinkBrand="Thinkpad";
        double thinkSize=13.0;
        double thinkPrice=4324.32;
        int thinkCount=5;
        
        String ASUSBrand="MacBookAir";
        double ASUSSize=11.6;
        double ASUSPrice=7657.32;
        int ASUSCount=7;
        
        int sum=macCount+thinkCount+ASUSCount;
        double tota=(macPrice*macCount)+(thinkPrice*thinkCount)+(ASUSPrice*ASUSCount);
        System.out.println("------------------------商城库存清单----------------------------");
        System.out.println("品牌型号  \t     尺寸 \t     价格      \t库存数");
        System.out.println(macBrand+"\t"+macSize+"\t"+macPrice+" \t"+macCount);
        System.out.println(thinkBrand+"\t"+thinkSize+" \t"+thinkPrice+" \t"+thinkCount);
        System.out.println(ASUSBrand+"\t"+ASUSSize+"\t"+ASUSPrice+" \t"+ASUSCount);
        System.out.println("-----------------------------------------------");
        System.out.println("总库存数："+sum);
        System.out.println("库存商品总金额："+tota);
        
	}

}
