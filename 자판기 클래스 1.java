import java.util.Scanner;
import java.util.ArrayList;
public class Nep extends  BuildMenu{
	 static ArrayList<Integer>p1 = new ArrayList<Integer>();
	 


	public static void main(String[] args) {
		
		p1.add(1000);
	 	p1.add(700);
	 	p1.add(600);

		//---->필요한 스캐너<----//
		Scanner sc1 =new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		Scanner sc3= new Scanner(System.in);
		//---->메뉴생성<----//
		BuildMenu b1 = new BuildMenu();
		//---->주문내역 보여주기 <----//
		ShowOrder o1 =new ShowOrder();
		//---->주문내역을 담을 arrayList<---//
		ArrayList al = new ArrayList();
		//--->필요한 변수 초기화<---//
		int s2= 0;
		int s3= 0;
		int sum1 = 0;
		int sum2 = 0;
		
		
		
		//---->초기메뉴 호출<----//
		b1.setMenu();
	    int s1 = sc1.nextInt();
	    while(s1!=4) {
	    
	    if(s1==1) {
	      b1.showmenu();
	      //메뉴 선택//
	      s2 =sc2.nextInt();
	      sum1=sum1+s2;
	      al.add(s2);
	      if(s2!=3){
	    	  //수량//
	    	  b1.Howmany();
	    	  s3=sc3.nextInt();
	    	  sum2=sum2+s3;
	    	  al.add(s3);
	    	  System.out.println("주문이 접수되었습니다.");
	    	 
	      }
	       
	    }else if(s1==2) {
	      System.out.println(al);
	    	
	    }else if(s1==3) {
	    	
	    	int sum5 = p1.get(sum1)*sum2;
	    	System.out.println("오늘의매출은"+sum5);
	    }
	    b1.setMenu();
	    s1 = sc1.nextInt();
		
	    }
	}
}
	  


