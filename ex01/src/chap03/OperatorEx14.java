package chap03;

class OperatorEx14 { 
      public static void main(String[] args) { 
            char c = 'a'; 
            for(int i=0; i<26; i++) {        
                        System.out.print(c++); 
            } 
            
            System.out.println(); // �ٹٲ��� �Ѵ�.

            c = 'A'; 
            for(int i=0; i<26; i++) {        
                        System.out.print(c++); 
            } 

            System.out.println(); 

            c='0'; 
            for(int i=0; i<10; i++) {         
                        System.out.print(c++); 
            } 
            System.out.println(); 
             
      } 
} 
