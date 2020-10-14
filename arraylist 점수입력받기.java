import java.util.ArrayList;
import java.util.Scanner;
public class Fuck {

	public static void main(String[] args) {
		// 시험점수를 입력받고 합과 평균을 구하자//
		//단 ArrayList 를 사용하자//
		ArrayList score = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		
		System.out.println("점수를 입력해주세요. 종료는 0");
		int n = sc.nextInt();
		
	   while(n>0) {
		   score.add(n);
		   sum= sum+n;
		  System.out.println("점수를 입력하세요. 종료는 0");
		  n =sc.nextInt();
		   
		   
		   
	   }
	   for(int i = 0 ; i<score.size();i++) {
		   System.out.println(score.get(i));
		  
			
	   }
	   System.out.println(sum/score.size());
	   System.out.println(sum);
		
		
	}
	
		
		
	}

	 
		 
