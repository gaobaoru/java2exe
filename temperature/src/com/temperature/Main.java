package com.temperature;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F_Temperature;
		double C_Temperature = 0.0;
		in = new Scanner(System.in);
		F_Temperature = in.nextInt();
		C_Temperature = (F_Temperature - 32) / (9.0 / 5.0);
		System.out.println((int)C_Temperature);

	}

}
