import java.util.Scanner;
import java.util.ArrayList;




public class Example {
        

	public static void main(String[] args) {
	    ArrayList a1 = new ArrayList();
	    
		Scanner sc1 =new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		Scanner sc3 =new Scanner(System.in);
		Menu m1 = new Menu();
	    HowMany h1 = new HowMany();
		m1.SetMenu();
		
		int n1 = sc1.nextInt();
		while(n1!=3) {
		if(n1==1) {
			m1.ShowMenu();
			int n2 = sc2.nextInt();
			a1.add(n2);
			h1.Many();
			int n3 = sc3.nextInt();
			a1.add(n2);
			System.out.println("주문이 접수되었습니다.");
			
			
			
			
		}else if(n1==2) {
			while(n1>0) {
				
			
			System.out.println("현재주문내역입니다."+a1);
			break;
			
			}
		}
		m1.SetMenu();
		n1 = sc1.nextInt();
		
		
	}
}
}
