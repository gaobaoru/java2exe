package string;

import java.util.Scanner;

public class string_test {

	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		char c = 'A';
		char d = (char)(c + 'a' - 'A');
		System.out.println(d);
		int i = 'Z' - 'A';
		System.out.println(i);
		System.out.println("abc\t123");
		System.out.println("a\t123");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.isDigit(c));
		
		String s = new String("Hello");
		System.out.println(s + (12 + 24));
		
//		String s1;
//		s1 = in.next();
//		System.out.println(s1);
		
		String str1 = new String("Hello");
		String str2 = str1;
		str2 = "abc";
		System.out.println(str1);
		System.out.println(str2);
		
		String s1 = "abc";
		String s2 = "abb";
		System.out.println(s1.charAt(2));
		for(int i1 = 0; i1 < s1.length(); i1++){
			System.out.println(s1.charAt(i1));
		}
		
		System.out.println(Math.abs(-12));
		System.out.println(Math.round(0.752));
		System.out.println(Math.random()*100);
		System.out.println(Math.pow(2, 3));
		
	}

}
