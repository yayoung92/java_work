package mysqltest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		DB db = new DB();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.할일입력  2.할일목록  3.종료  4.삭제  5.수정");
			System.out.println("번호 입력하세요 : ");
			String input = scan.next();
			System.out.println("========================");

			if (input.equals("1")) {
				System.out.print("뭐할래? : ");
				String todo = scan.next();
				System.out.print("상태 어떻노? : ");
				String state = scan.next();
				db.insert(todo, state);
				System.out.println();
				System.out.println("-------------------------");
				
			} 
			else if (input.equals("2")) {
				db.select();
				System.out.println();
				System.out.println("-------------------------");
			} 
			else if (input.equals("4")) {
				System.out.print("몇번 할일 삭제할까? : ");
				int idx = scan.nextInt();
				db.delete(idx);
				System.out.println();
				System.out.println("-------------------------");
			}
			else if (input.equals("5")) {
				System.out.print("몇번 할일 수정할까? : ");
				int idx = scan.nextInt();
				System.out.print("수정해서 뭐 할건데? : ");
				String todo = scan.next();
				db.update(idx, todo);
				System.out.println();
				System.out.println("-------------------------");
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
