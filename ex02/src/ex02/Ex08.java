package ex02;

import java.util.Scanner;

/*
 * 숫자 두개를 입력받아 합계를 출력하세요
 * 
 * scanner 안에 있는 함수
 * nextLine 문자열 입력받는다.
 * nextInt 숫자를 입력받는다.
 * 
 */

public class Ex08 {
	
	//num1 과 num2 매개변수 로 받는 int형을 돌려주는 solution 함수
	public static int solution(int num1, int num2) {
		num1 = 10;
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요: ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요: ");
		int b = scan.nextInt();
		
		int result = solution(num1, b);
		
		System.out.println("합: " + result);
		System.out.println("num1: " + num1);

	}
}
