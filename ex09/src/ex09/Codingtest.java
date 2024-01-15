package ex09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Codingtest {
	public static void main(String[] args) throws Exception{
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();  // 
//		int m = scan.nextInt();  // 
//		
//		int N[] = new int[n];  // 공의 길이
//		for(int i=0; i<N.length; i++) {
//			N[i] = i+1;
//		}
//		System.out.println(Arrays.toString(N));
//		
//		int M[][] = new int[m][2];
//		
//		for(int i=0; i<m; i++) {	
//			for(int  j=0; j<2; j++) {
//				M[i][j] = scan.nextInt();
//
//				
//			}
//		}	
//		System.out.println("M= " + Arrays.toString(M));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());  // 바구니의 갯수
		int b = Integer.parseInt(st.nextToken());  // 공 몇번 바꿀건지
		
		int N[] = new int[a];  // 바구니의 갯수만큼 바구니에 숫자 부여
		for(int i=0; i<N.length; i++) {
			N[i] = i+1;
		}
		System.out.println(Arrays.toString(N));
		
		int M[] = new int[b];
		int J[] = new int[b];
		for(int i=0; i<M.length; i++) {
			st = new StringTokenizer(br.readLine());
			M[i] = Integer.parseInt(st.nextToken());
			J[i] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i=0; i<M.length; i++) {
		//	System.out.println("N[i] = " + N[i]);
		//	int z = N[i];
			
			for(int j=0; j<J.length; j++) {
				if(N[M[i]-1]!=N[J[j]-1]) {
					
					int t = N[M[i]-1];
					N[M[i]-1] = N[M[j]-1];
					N[M[j]-1] = t;
					
					System.out.print("M = " + Arrays.toString(M) + "\n");
					System.out.print("J = " + Arrays.toString(J) + "\n");
					System.out.print("N = " + Arrays.toString(N)+ "\n");
				}
			}

		}
		System.out.println();
		System.out.print("M = " + Arrays.toString(M) + "\n");
		System.out.print("J = " + Arrays.toString(J) + "\n");
		System.out.print("N = " + Arrays.toString(N));
		
		br.close();
		bw.close();
		
	}
}
