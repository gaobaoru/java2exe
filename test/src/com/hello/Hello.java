package com.hello;

import java.util.Scanner;

public class Hello {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你好");
		in = new Scanner(System.in);
//		System.out.println("echo: " + in.nextLine());
		int price = 0;
		int amount = 100;
//		final int amount = 100; // 常量
		System.out.println("请输入票面：");
		amount = in.nextInt();
		System.out.println("请输入金额：");
		price = in.nextInt();
	   System.out.println( amount + " - " + price +" = " + (amount - price));
	}

}
