
import java.util.Scanner;
public class project {

	public static void main(String[] args) {
	    
		//사용자로부터 아이디를 입력받는 문구 1차 //
		System.out.println("Please input your id");
		
		
		//스캐너 객체를선언 //
		Scanner scanner1 = new Scanner(System.in);
		//스캐너 객체를 불러올 변수를 지정//
		String id =scanner1.nextLine();
		//if문에서 스캐너 객체에서 입력받은내용이 일치한지 여부를 파악//
		if(id.equals("dlwnghks12")) {
			//아이디가 일치하면 비밀번호를 입력해달라는 문구를 추가//
	      System.out.println("Please input your password");
	      
			String password = scanner1.next();
			//일치한다면, 비밀번호를 입력받는 로직//
			
    	if(password.equals("1111")) {
    		System.out.println("Succes to login");
    		//로그인성공//
    		
    		//로그인 오류//
    		
    		//비밀번호 오류//
    	}else {
    		System.out.println("your password is not working");
    	}
    		//아이디 오류 //
    }else {
    	System.out.println("your id is not working  ");
    }
}
	
	
}

