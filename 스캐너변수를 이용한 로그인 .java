
import java.util.Scanner;
public class project {

	public static void main(String[] args) {
		System.out.println("please input your id");
      
    Scanner a = new Scanner(System.in);
    
    String  id = a.nextLine();
    if(id.equals("dlwnghks6821")) {
    	System.out.println("비밀번호를 입력해주세요.");
    	String pwd = a.nextLine();{
    		if(pwd.equals("1111")) {
    			System.out.print("로그인성");
    		}else {
    			System.out.println("비밀번호 오류");
    		}
    	}
    }else {
    	System.out.println("아이디오류");
    }
     
    
}
	
	
}
