import java.util.ArrayList;
import java.util.Scanner;
public class Fuck {

	public static void main(String[] args) {
	   //---> 이름을 입력하는 스캐너  <---//
	   Scanner sName = new Scanner(System.in);
	   //---> 전화 번호를 입력하는 스캐너 <---//
	   Scanner sMobile = new Scanner(System.in);
	   //--->이름을 넣는 배열<---//
	   ArrayList alName= new ArrayList();
	   //--->전화번호를 넣는 배열<---//
	   ArrayList alMobile= new ArrayList();
	   
	   
	   
	   System.out.println("이름을 입력하세요.");
	   //--->이름을 입력하는 스캐너를 위에서 선언했기때문에 만들어준다<---//
	   String strName = sName.nextLine();
	   
	   
	  //--->ArrayList 라는 특성상 그 값을 먼저 정하고 배열을 만들지 않기때문에 어느 기준에서 배열을 계속//
	   //만들지를 정해준다. 반복문으로 //<---//
	   
	   while(!strName.equals("")) {
		   System.out.println("번호를 입력하세요.");
		   String strMobile = sMobile.nextLine();
		   alName.add(strName);
		   alMobile.add(strMobile);
		   System.out.println("이름을 입력하세요.");
		   strName = sName.nextLine();
	   }
	   for(int i = 0 ; i<alName.size() ;i++) {
		   System.out.println(alName.get(i));
		   System.out.println(alMobile.get(i));
		   
	   }
	   
	   }
	    		
	}
	 		

