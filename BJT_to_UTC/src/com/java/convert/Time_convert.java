package com.java.convert;

import java.util.Scanner;

public class Time_convert {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int bjt = in.nextInt();
		int num1 = bjt % 100;
		int num2 = bjt / 100;
		int utc = 0;
		if(num2 == 8)
		{
			utc = num1;
		}
		else if(num2 < 8)
		{
			utc = (num2 - 8 + 24) * 100 + num1;
		}
		else
		{
			utc = (num2 - 8) * 100 + num1;
		}
		System.out.println(utc);
	}
	
}
