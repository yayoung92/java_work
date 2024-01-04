package ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		boolean a = true;
		// ! 부정하는 기호
		boolean b = !a;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	
		int c = 10; // 10을 c 에 대입한다.
		int d = 20;
		System.out.println("c = " +c);
		System.out.println("d = " +d);
		
/*

연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

*/
		Scanner scan = new Scanner(System.in);
		int aa = scan.nextInt();
		
		if(aa>=90 && aa<=100) {
			System.out.println("A");
		} else if(aa>=80 && aa<90) {
			System.out.println("B");
		} else if(aa>=70 && aa<80) {
			System.out.println("C");
		} else if(aa>=60 && aa<70) {
			System.out.println("D");
		}
	}
}
