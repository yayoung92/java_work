package jjj;//검색 기능

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A2 {
    private static final String FILE_PATH = "registered_data.txt";


    public void searchData(String keyword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean found = false;

            System.out.println("----------데이터 검색----------");

            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    // 검색어를 포함하는 데이터를 찾았을 때 
                    System.out.println(line);
                    found = true;
                }
            }
            //찾지 못했다면
            if (!found) {
                System.out.println("일치하는 데이터가 없습니다.");
            }

            System.out.println("데이터 검색이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("데이터를 검색하는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        A2 a2 = new A2(); 
        a2.searchData("검색어");
    }
}
