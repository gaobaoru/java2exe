package com.loop;

import java.util.Scanner;

public class loop_test {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		//前50个素数
//		int[] primes = new int[50];
//		primes[0] = 2;
//		int cnt = 1;
//		MAIN_LOOP:
//		for( int x = 3; cnt < 50; x++){
//			for( int i = 0; i < cnt; i++){
//				if( x % primes[i] == 0){
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x;
//		}
//		for( int k : primes){
//			System.out.print(k + " ");
//		}
//		System.out.println();
		//100以内的素数
		boolean[] isPrime = new boolean[100];
		for( int i = 0; i < isPrime.length; i++){
			isPrime[i] = true;
		}
		for(int i = 2; i < isPrime.length; i++){
			if(isPrime[i]){
				for(int k = 2; i*k < isPrime.length; k++){
					isPrime[i*k] = false;
				}
			}
		}
		for( int i = 2; i < isPrime.length; i++){
			if(isPrime[i]){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
