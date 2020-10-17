class Calculator2{
	
	//===>클래스 변수 선언 <===//
	static double PI =3.14;
	//==>모든 객체가 똑같은 값을 가진다 <==//
	//==>멤버 변수 <==//
	int a = 0 ;
    int b = 0 ;
	
	//this. 를 사용하는 예시 //
    
    //1).내가 클래스 아래에서 멤버면수를 선언을 해요.
    //2).근데 그 멤버변수가 매개변수 이름과 일치할때..
    //3).같은 변수이름이지만 하는 역할은 다른 변수잖아요 그럴땐
    //4). this.를 써주어서  this .가 붙은 변수는 멤버변수이다 라는걸 알려주는겁니다//
    
	public void setOperands(int a, int b) {
		//this.a = 멤버변수 a 라는 뜻이고 a 는 메소드의 매개변수 라는뜻//
		//this.b = 멤버변수 b 라는 뜻이고 b 는 메소드의 매개변수 라는뜻//
	 this.a = a;
	 this.b	= b;
	  
		
		
	}
	public void sum() {
		
	}

	
	
}
	
	

public class idol {
	

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10,20);
		
		c1.sum();
		
		
		
		
		Calculator2 c2 =new Calculator2();
		c2.setOperands(20,40);
		System.out.println(c2.PI);
		
		c2.sum();
		
		
		
		
		
	
	}
	
	

}
ㄹ