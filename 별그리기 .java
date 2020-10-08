import java.util.Scanner;
public class Newnew1 {

	public static void main(String[] args) {
		
		
		//정수를 입력받고  1부터 입력된 수만큼 1씩 증가시키며 별을 찍고, 다시 1까지 감소시키는 출력문을 만들어라 //
	  
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력해주세요");
	
     int d = sc.nextInt();
     String s = "*";
     
      for(int i = 1 ; i < d ; i ++) {
    	  System.out.print(s);
    	  for(int j= 1; j>d ; j--) {
    		  System.out.print(j);
    	  }
      }
     
	
	
	}
	
	
		}


	


