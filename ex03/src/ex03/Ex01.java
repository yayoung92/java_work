package ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 참조 변수 선언
		Scanner scan = new Scanner(System.in);
		
		// 문자열 입력 출력해라
		//System.out.println("문자열 입력");
		// 입력 받아라.. next 함수는 빈공백 String 5
//		String str = scan.next();
//		System.out.println("반복횟수 입력");
//		int n = scan.nextInt();
//		
//		System.out.println("str = " + str);
//		System.out.println("n = " + n);
		
		/*
		 * i = 0 일때 for구문 안에 있는거 반복해라
		 */
//		for (int i=0; i<5; i++) {
//			System.out.print(i);
//		}
		System.out.println();
		for (int i=0; i<5; i=i+2) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			if(i%2==0) {
				System.out.print(i);
			}
		}
	}
}
