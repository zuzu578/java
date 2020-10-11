import java.util.Scanner;

public class NNN2 {

	
	
	public static void main(String[] args) {
		

		 int sum = 1;
		
		System.out.println("정수를 입력해주십쇼. ");
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i =n ; i>=1 ; i--) {
		sum= sum*n;
		  for(int j = 1; j>0; j--) {
			  System.out.print(i+"X"+"="+sum);
			System.out.println();
			  
		  }
		}
		
			
		
		
		
		
	 
		
}
	
}