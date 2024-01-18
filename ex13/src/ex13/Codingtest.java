package ex13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Codingtest {
	public static void main(String[] args) throws Exception{
		int l = 5;
		int r = 555;
		int[] answer = {};
		String[] b = {};
		String a = "";
		int u = 0;
		
		for(int i=l; i<=r; i++) {		
			
			String y = Integer.toString(i);
			b[i] = Integer.toString(i);

			//char[] c = y.toCharArray();
			
			//System.out.println(c);
			char cc = y.charAt(j);
			
			for(int j=0; j<y.length(); j++) {
				
				//System.out.println(cc);
				if(cc==5) {
					a = Integer.toString(cc);
					System.out.println(u);
				}				
			}
		}
	}
}
