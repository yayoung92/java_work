package chap03;

class OperatorEx16 { 
	public static void main(String[] args) { 
		float pi = 3.141592f; 
		float shortPi = (int)(pi * 1000) / 1000f; 

		System.out.println(shortPi); 
		
		// double a = 2.1235484647d;
		// a*100 = 212.35484647
		// (int) -> 212
		// 212/100d -> 2.12
		double a = 2.1235484647d;
		System.out.println( ((int)(a*100))/100d );
	} 
} 
