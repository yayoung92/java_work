package ex04;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] c = a.toCharArray();
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
