package com.java.ticket;

import java.util.Scanner;

public class ticket {
	private static Scanner in;

	public static void main(String[] ags){
		in = new Scanner(System.in);
		//请输入投币金额
		System.out.println("请投币： ");
		int amount = in.nextInt();
		System.out.println(amount >= 10);
		if( amount >= 10){
			//打印车票
			System.out.println("*****************");
			System.out.println("*java城际铁路专线*");
			System.out.println("*    无指定座位        *");
			System.out.println("*     票价：10元       *");
			System.out.println("*****************");
			//计算并打印找零
			System.out.println("找零： "+ (amount - 10));
		}
	}
}
