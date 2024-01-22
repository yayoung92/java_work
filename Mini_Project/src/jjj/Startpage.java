package jjj;

import java.util.Scanner;

public class Startpage {
	//첫 화면
	public static void main(String[] args) {
		
		System.out.println("1.데이터 등록");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 수정");
		System.out.println("4.데이터 삭제");
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요.(ex 1)");
		int menu=scanner.nextInt();
		
		switch(menu) {
		case 1:
			A1 register=new A1();
			register.registerData();
			break;
			
		case 2:
			 A2 search = new A2();
             System.out.println("검색어를 입력하세요: ");
             String keyword = scanner.next();
             search.searchData(keyword); // 검색어 전달
             break;
			
		};
		
	}

}
