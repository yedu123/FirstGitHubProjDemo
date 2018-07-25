package cn.kgc.If;

import java.util.Scanner;

public class Demo {
	//控制台输入一个数,判断奇偶
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num = input.nextInt();
		if(num%2 == 0) {
			System.out.println(num+":偶数!");
		}else {
			System.out.println(num+":奇数!");
		}
		
		
		System.out.println();
		System.out.println("输入张浩的JAVA成绩:");
		int i = input.nextInt(); 
		if (i>90) {
			System.out.println("老师说:不错,奖励一个iphone5!");
		}
	}

}
