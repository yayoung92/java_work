package user;

import java.util.Scanner;

import infor.User;
import infor.Person;

public class Login {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		Person p = new Person();
		boolean check = true;
		
		System.out.println("******************************************");
		System.out.println("*             주소록 관리 프로그램             *");
		System.out.println("******************************************");
		System.out.println("------------------------------------------");
		System.out.println("          <      로그인 하기      >          ");
		System.out.print("  ●  아이디를 입력하세요: ");
		String id = scan.next();
		
		System.out.print("  ●  비밀번호를 입력하세요: ");
		String password = scan.next();
		System.out.println();
		
		// 로그인 성공했을 경우
		System.out.println("-----------     로그인 성공!!     -----------");
		System.out.println();
		System.out.println(">>           " + id + " 님 환영합니다!           <<");
		
		// 로그린 실해했을 경우
		
		stop:while(check) {
			System.out.println();
			System.out.println("******************************************");
			System.out.println("*             주소록 관리 프로그램             *");
			System.out.println("******************************************");
			System.out.println();
			System.out.println("1.리스트  2.등록  3.수정  4.삭제  5.검색  6.종료  7.설정");
			System.out.println("------------------------------------------");
			System.out.print("> 메뉴번호 : ");
			int num = 0;
			num = scan.nextInt();
			System.out.println();

			switch(num) {
				case 1:
					System.out.println("<1.리스트>");
					// 회원 리스트 나온다.
					System.out.println();
					if(Person.getPersonName()==null) {
						System.out.println("   등록된 사람이 없습니다.  ");
					} else {
						int n = 0;
						n++;
						System.out.println( num + ". " +  Person.getPersonName() + " : " + Person.getPhoneNumber());
					}

					break;
				case 2:
					//등록하는 입력 창
					
					System.out.println("<2.등록하기>");
					System.out.println();
					
					System.out.print(" -  이름 : ");
					Person.setPersonName(scan.next());
					
					System.out.print(" -  전화번호( - 포함해서 입력해주세요) : ");
					Person.setPhoneNumber(scan.next());
					
					System.out.print(" -  나이 : ");
					Person.setAge(scan.nextInt());
					
					System.out.print(" -  생일 : ");
					Person.setDate(scan.next());
				
					System.out.print(" -  MBTI : ");
					Person.setMBTI(scan.next());
					
					System.out.print(" -  성별 : ");
					Person.setGender(scan.next());
					
					System.out.print(" -  별명 : ");
					Person.setStar(scan.next());
					
					System.out.println();
					System.out.println(p.toString());
					System.out.println();
					System.out.println(" [ 등록되었습니다. ] ");
					
					break;
				case 3:
					// 수정하는 부분
					System.out.println("<3.수정하기>");
					System.out.println();
					
					System.out.println(" 이름 수정하기 = " + Person.getPersonName() + " -> ");
					Person.setPersonName(scan.next());
					
					System.out.println();
					System.out.println(" [ 수정되었습니다. ] ");
					break;
				case 4:
					// 삭제하는 부분
					System.out.println("<4.삭제하기>");
					System.out.println();
					
					System.out.println(" [ 삭제되었습니다. ] ");
					break;
				case 5:
					//검색하는 부분
					System.out.println("<5.검색하기>");
					break;
				case 6:
					// 종료하는 부분
					System.out.println();
					break stop;
				case 7:
					// 설정하는 부분
					System.out.println("<7.설정>");
					System.out.println();
					
					
					break;
				default:
					break;
			}
		}
		
		System.out.println("종료되었습니다.");
		
	}
}
