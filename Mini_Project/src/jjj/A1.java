package jjj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1 {
	private static final String FILE_PATH="registered_data.txt";

	// register_data.txt 파일에 데이터들 저장!
	public void registerData() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("----------데이터 등록----------");

		System.out.println("이름 :");
		String name = scanner.nextLine();

		System.out.println("성별 :");
		String gender = scanner.nextLine();

		System.out.println("생일 :");
		int birth = scanner.nextInt();

		System.out.println("나이 :");
		int age = scanner.nextInt();

		System.out.println("mbti :");
		String mb = scanner.nextLine();
		scanner.nextLine();

		System.out.println("소속 :");
		String group = scanner.nextLine();

		System.out.println("주소 :");
		String adress = scanner.nextLine();

		System.out.println("메모 :");
		String memo = scanner.nextLine();

		saveData(name, gender, birth, age, mb, group, adress, memo);

	}

	private void saveData(String name, String gender, int birth, int age, String mb, String group, String adress,
			String memo) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH,true))) {
			writer.write("이름:" + name + "\n");
			writer.write("성별:" + gender + "\n");
			writer.write("생일:" + birth + "\n");
			writer.write("나이:" + age + "\n");
			writer.write("MBTI:" + mb + "\n");
			writer.write("주소:" + adress + "\n");
			writer.write("메모:" + memo + "\n");
			writer.write("-------------------\n");

			System.out.println("데이터가 성공적으로 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("데이터를 저장하는 중 오류가 발생했습니다" + e.getMessage());
		}

	}

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.registerData();
	}

}
