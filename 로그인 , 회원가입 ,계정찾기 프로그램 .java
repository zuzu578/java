import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
		String id = "dlwnghks6821";
	  
		
		Scanner sc =new Scanner(System.in);
		System.out.println("1.회원가입 2.로그인 3. 계정찾기.");
		
		  int choice = sc.nextInt();
		  
		  if(choice==1){
			  System.out.println("Please in put your id");
				
				String i = sc.nextLine();
			     i = sc.nextLine();
			     if(i.equals(i)) {
						System.out.println("아이디 중복을 확인해주세요.1번을 누르면 중복확인 ");
						int d = sc.nextInt();
					  if(d==1) {
						  System.out.println("아이디 중복을 확인합니다...");
						  if(id.equals(i)) {
							  System.out.println("현재 이 아이디는 이미 사용중입니다.  ");
						  }else {
							  System.out.println("아이디 사용가능! ");
							  System.out.println("비밀번호를입력해주세요. ");
							  String  pwd = sc.nextLine();
							  pwd =sc.nextLine();
							 
							 
							  
							  if(true) {
								  System.out.println("회원가입이 완료되었습니다..");
							  }
						  }
						  
						  
					  }
					}

					
					
					
		  		}else if(choice ==2) {
		  			System.out.println("아이디를 입력해주세요.");
		  			String login1 = sc.nextLine();
		  			login1 =sc.nextLine();
		  			String id1 = "dlwnghks";
		  			String pwd1 = "123qwe";
		  			
		  			if(id1.equals(login1)) {
		  				System.out.println("비밀번호를입력해주세요. ");
		  				id1 = sc.nextLine();
		  			 if(id1.equals(pwd1)) {
		  				 System.out.println("로그인성공! ");
		  			 }else {
		  				 System.out.println("비밀번호가 일치하지않습니다.");
		  			 }
		  			}else {
		  				System.out.println("아이디가 일치하지않습니다.");
		  			}
		  		}else if(choice == 3) {
		  			System.out.println("1.아이디찾기"+"2비밀번호 찾기 ");
		  		   int choice1 = sc.nextInt();
		  		   if(choice1 == 1) {
		  			   System.out.println("가입할때 입력하신 이메일을 입력해주세요");
		  			   String email = sc.nextLine();
		  			   if(true) {
		  				   System.out.println("이메일로 코드를 발송했습니다. 확인해주세요.");
		  			   }
		  		   }if(choice1 == 2) {
		  			   System.out.println("비밀번호를 찾기 위해서 아이디를 입력해주세요.");
		  			  String findId = sc.nextLine();
		  			  findId = sc.nextLine();
		  			  if(findId.equals(findId)) {
		  				  System.out.println("비밀번호를 재설정합니다.");
		  				  System.out.println("재설정하실 비밀번호를 입력해주세요.");
		  				 String newPassword = sc.nextLine();
		  				 newPassword = sc.nextLine();
		  				 if(newPassword.equals(newPassword)){
		  					 System.out.println(newPassword+"로 변경되었습니다. 로그인해주세요.");
		  				 }
		  			  }
		  			  
		  		   }
		  		}
		  }

		
	}
	

