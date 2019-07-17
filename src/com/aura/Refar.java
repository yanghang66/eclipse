package com.aura;

import java.util.Random;
import java.util.Scanner;

public class Refar {

	public static void main(String[] args) {
	System.out.println("请输入三个数");
	Scanner scanner=new Scanner(System.in);
   int a[]=new int [3];
   
   int i,j;
   for(i=0;i<3;i++) {
	   a[i]=scanner.nextInt();
   }
   int max=a[0];
   for(j=0;j<3;j++) {
	   if(a[j]>max) {
		   max=a[j];
	   }
   }
   System.out.println(max);
	
}
}
