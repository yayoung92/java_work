package ex05;

import java.util.Scanner;

public class Text {
	public static String ss(String my, int k) {
		String answer = "";
		for(int i=0; i<k; i++) {
			answer = answer + my;
		}
		return answer;
	}
	public static void main(String[] args) {
		
		String my = "abcde";
		int num = 10;
		
		String tmp = ss(my,num);
		System.out.println(tmp);
		
	
		
		
		/////////////////////////
		int zz = 15;
		System.out.printf("%s", zz);
		System.out.println(zz);

	}
}
