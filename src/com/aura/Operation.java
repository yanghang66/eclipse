package com.aura;

public class Operation {

	public static void main(String[] args) {
	      int a=3,b=5;
	      //位运算符&  | ^ ~ << >> >>>
        //00000000 00000000 00000000 00000000  0
	    //00000000 00000000 00000000 00000001  1
	    //00000000 00000000 00000000 00000010  2
	      
	    //11111111 11111111 11111111 11111111  -1
	    //11111111 11111111 11111111 11111110  -2
	    //11111111 11111111 11111111 11111101  -3
	    //11111111 11111111 11111111 11111100  -4
	      //~0=-1
//	      -A=~A+1
//	     ~A=-A-1
//	      ~3=-3-1
	      int c=a&b;//1
          int d=a|b;//7
          int e=a^b;//6
          int f=~a;//-4
          int g=a<<1;//6
          int h=-3>>1;//补符号位
          int i=-3>>>1;//补0
          System.out.println(h);
          System.out.println(i);
	}

}
