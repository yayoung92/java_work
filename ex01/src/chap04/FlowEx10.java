package chap04;

import java.util.*;

class FlowEx10 {
	public static void main(String[] args) { 
		int score  = 0;
		char grade = ' ';

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		score = Integer.parseInt(tmp); 

		switch(score/10) {
			case 10:
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		} // end of switch

		System.out.println("����� ������ "+ grade +"�Դϴ�.");
	}
}
