import java.util.Scanner;
public class JavaNew {

	public static void main(String[] args) {
		 String []  name =  new String[7];
		int[] point = new int[7];
		
		//이름을 입력하세요.//
		//aaa//
		//점수를 입력하세요 //
		///dwdwdw//
		//점수를 입력하세요//
		//99//
		
	
		//for 2 =출력한다. (이름 ; 점수 );//
	       Scanner sc1 = new Scanner(System.in);
	       Scanner sc2 = new Scanner(System.in);
	       for(int i = 0; i<7; i++){
	    	    System.out.println("이름을 입력해주세요.");
	         String n = sc1.nextLine();
	         name[i]=n;
	          
	           System.out.println("점수를 입력해주세요.");
	           int num = sc2.nextInt();
	           point[i]=num;
				 
	       }
	         for(int j = 0; j<7 ; j++){
	        	 System.out.println(name[j]+";"+point[j]);
	         }
				 
	}
	}

