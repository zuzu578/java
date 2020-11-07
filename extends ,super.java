import java.util.Scanner;
import java.util.ArrayList;

public class testfor {
  
	
	public static void main(String[] args) {
	  Sub s1 = new Sub(10,20);
	  s1.sum();
	  s1.avg();
	  s1.subtract();
}
}
class Calculator{
	int left, right ;
	Calculator(){
		//1) ===>! 상속을 할땐 반드시 부모의 기본생성자를 명시해주어야한다 !<===//
	}
	
   Calculator(int left, int right){
	   this.left = left;
	   this.right = right;
	   
	   
	   
   }
   void setOperands(int left, int right) {
	   this.left=left;
	   this.right=right;
   }
   void sum() {
	   System.out.println(this.left+this.right);
   }
	
   void avg() {
	   System.out.println((this.left+this.right)/2);
   }
	
	
}
class Sub extends Calculator{
	
	
	Sub(int left, int right){
		//2)==>!부모의 기본생성자를 명시하는대신자식의 초기화 코드보다 먼저 super를 등장시켜준다!<===//
		
		super(left,right);
		this.left=left;
		this.right=right;
	}
	void subtract() {
		System.out.println(this.left-this.right);
	}
	
	
}