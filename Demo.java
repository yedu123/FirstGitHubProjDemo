package cn.kgc.If;

import java.util.Scanner;

public class Demo {
	//����̨����һ����,�ж���ż
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		if(num%2 == 0) {
			System.out.println(num+":ż��!");
		}else {
			System.out.println(num+":����!");
		}
		
		
		System.out.println();
		System.out.println("�����źƵ�JAVA�ɼ�:");
		int i = input.nextInt(); 
		if (i>90) {
			System.out.println("��ʦ˵:����,����һ��iphone5!");
		}
	}

}
