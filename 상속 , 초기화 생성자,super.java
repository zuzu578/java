import java.util.Scanner;
import java.util.ArrayList;

public class testfor {
	

	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator(10,20);
		c1.sum();
		c1.avg();
		c1.subtract();
     //결론
		//1) 상속을 사용할때는 반드시 부모의 기본생성자를 명시해주어야 한다//
		//2) 부모의 기본생성자를 명시하는 대신 자식한테 가서 부모의 생성자를 호출하는 방법도있다(super)//
		//3) 반드시 super를 호출할때는 상위 생성자가 먼저 등장해야한다//
		
      
    
     
     
	}

}
class Calculator{
	
	//*상속을 할때 상위클래스의 기본생성자를 호출하게된다 //

	//하위클래스가 상속을 할때 상위 클래스인 Caculator는 것을 기본생성자를호출을 해야하는데 //
	//기본생성자가 없을시에는 에러가 발생합니다//
	
	int left, right;
	//parameter를받는 생성자를 하나만들어줬기때문에//
	//자바에서는 기본생성자를 자동으로만들어 주지않는다 //
	public Calculator(int left, int right) {
		this.left=left;
		this.right=right;
	}
	//상속을 할떄 == > 부모의 기본생성자가 반드시 있어야함 //
	
	//Calculator(){
		
	//}
	public void setOperands(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
 class SubtractionableCalculator extends Calculator{
	 

	public SubtractionableCalculator(int left,int right) {
		// super ==>부모의 생성자를 호출한다 //
		// 만약에 부모의 기본생성자가 없을때 에러가발생할때//
		//해결법
		//1). 부모에 기본생성자를 추가해준다//
		//2).자식한테 가서 부모의 생성자를 호출하는 super라는 것을 사용한다//
		
		//자식의 초기화 코드를 super(부모)보다 먼저 등장시키면 안된다//
		//하위 클래스의 초기화 코드는 항상 상위클래스의 생성자를 호출후에 다음에 나타나야한다//
		
		 //super ==> 부모의 생성자 //
		//super==>상위 클래스의 생성자//
	    super(left,right);
	     //자식의 초기화 코드//
	     //하위 클래스의 초기화 코드//
		 this.left = left;
		 this.right = right;
	    
		
		 
	 }
	public void subtract() {
		System.out.println(this.left-this.right);
	}
	
}