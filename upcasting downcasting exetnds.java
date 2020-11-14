import java.util.Scanner;



public class Example1 {


	public static void main(String[] args) {
		A a1 = new A(50,70);
		 a1.sum();
		
	
	}
	
}
class A{
	int k;
	int l;

	A(int x, int y){
		k = x;
		l = y;
	}
	protected void sum() {
		System.out.println("부모"+(k+l));
	}
	
}

class B extends A{
	B(int x, int y){
		super(x,y);
		k = x;
		l = y;
		
	}
	protected void sum() {
		System.out.println("자식"+(k+l));
	}
}