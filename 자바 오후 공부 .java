import java.util.Scanner;
public class Newnew1 {

	public static void main(String[] args) {
		
		//1부터 5까지 출력//
		

         /* for(int i = 1 ; i <=5 ; i++) {
        	  System.out.println(i);
          }*/
		
		
		//1부터 10까지 합 구하기 // 
		/*int sum1 = 0 ;
		for(int i = 1 ; i <= 10 ; i ++) {
			sum1 = i+sum1 ;
			System.out.println(sum1);
		}*/
		
		//별찍기//
		
		
		/*for(int  i = 1; i <= 10 ; i++) {
			for(int j = 1 ; j <= 10 ; j++) {
				System.out.println("*");
			}
			
		}*/
           //구구단 3단//
		
		/*for(int i = 1 ; i <= 5 ; i ++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		
	
		
		}*/
		/*for(int i = 1; i<=5 ; i++) 
			 for(int j = 5 ; j <=5 ; j++) {
				  System.out.println(i+"."+"hi");
			  }*/
		
		//0~10 까지 숫자중 짝수만 찍어라//
		
		// 짝수의 조건 : 2 4 6 8 10 ;
		// 짝수는 2로 나눌때 0으로 나눠떨어지는애들 //
		//짝수의 합 //
		
		/*int sum = 0 ; 
		
		
		for(int i = 0 ; i <= 10 ; i++)
		
			if(i%2!=0) {
				sum = i+sum;
				System.out.println(sum);
			}
		
			
			
			
		}*/
		
		
		//구구단 5단 출력하는 예제 //
		/*int num1 = 5;
		
		for(int i = 9;  i<= 9 ; i++) {
			
		for(int j = 1 ; j <= 9 ;j++) {
			System.out.print(num1+"X"+j+"="+num1*j);
		   System.out.println();
		}
		 
		}*/
		
		//팩토리얼 //
		
		//5.4.3.2.1//
		//5*4*3*2*1//
		
        
       
      Scanner sc = new Scanner(System.in);
      
      System.out.println("숫자를 입력해주세요.");
      int s = sc.nextInt();
       int p = 1; 
       
       
      
      
      for(int i= s ;  s >0;  s --) {
    	  p = s*p ; 
    	  System.out.println(p);
      }
	} 
		   
			   
	 

		 
		 
		   
		}
		
	
		