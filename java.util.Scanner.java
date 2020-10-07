import java.util.Scanner;


public class javascript {

	public static void main(String[] args) {
       
		Scanner a = new Scanner(System.in);
		
	
		String str= a.nextLine();
		int i = a.nextInt();
		
		if(i<10) {
			System.out.println("ten");
		}else if(i<100) {
			System.out.println("hundred");
		}else if(i<1000) {
			System.out.println("thousand");
		}
		
		
	}
}

