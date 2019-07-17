package com.aura;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran=new Random();//生成随机数
        int value=ran.nextInt(10);//[0,10 )                                )
        Scanner scanner=new Scanner(System.in);
        int count=0;
        while(count<3) {
        System.out.print("请输入一个整数：");
        
        int num=scanner.nextInt();
        if(num==value) {
        	System.out.println("恭喜你猜对了~");
        	break;
        }else if(num>value) {
        	System.out.println("对不起，猜大了");
        }else {
        	System.out.println("对不起，猜小了");
        }
        count++;
        }
	}

}
