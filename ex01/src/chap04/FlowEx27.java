package chap04;

import java.util.*;

class FlowEx27 {
	public static void main(String[] args) { 
		int num = 0;
		int sum = 0;
		boolean flag = true;  
		
		//증가대입연산자
		while(flag) {  
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);  

			if(num!=0) {  
				sum += num; 
			} else {
				flag = false;  
			}
		} 

		System.out.println("합계:"+ sum);
	}
}
