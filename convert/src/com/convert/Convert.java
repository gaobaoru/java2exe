package com.convert;

import java.util.Scanner;

public class Convert {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
//		int inch;(foot + inch/12.0)*0.3048(foot + inch/12.0)*0.3048
		double inch;
		in = new Scanner(System.in);
		foot = in.nextInt();
//		inch = in.nextInt();
		inch = in.nextDouble();
		System.out.println("foot = " + foot + ", inch = " + inch);
		System.out.println((int)((foot + inch/12.0)*0.3048*100)  + " cm");
	}

}
