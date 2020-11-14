
public class Example1 {

	public static void main(String[] args) {
		Calculator c1 = new cal1();
		c1.sum();
		c1.avg();
		c1.div();
		c1.multi();
		
			
	}
	
}

abstract class Calculator{
	int a; 
	int b; 
	Calculator(){
		a = 10 ;
		b = 5;
	}
	protected abstract void sum();
	protected abstract void avg();
	protected abstract void div();
	protected abstract void multi();
}

class cal1 extends Calculator{
		cal1(){
			a = 40;
			b = 20;
		}
	protected void sum() {
		System.out.println(a+b);
	}
	protected void avg() {
		System.out.println((a+b)/2);
	}
	protected  void div() {
	   System.out.println(a/b);
		
	}
	protected void multi() {
		System.out.println(a*b);
	}
}




public class Example1 {

	public static void main(String[] args) {
	 A a1 = new A(20,30);
	 a1.running();
	 B b1 = new B();
	 b1.running();
     
	 
		
			
	}
	
}

class A{
	static int k ; 
	static int q ; 
	A(){
		
	}
	A(int x , int y ){
 
	  this.k = x; 
	  this.q = y;
	}
	
	protected void running() {
		System.out.println("부모");
		System.out.println(k+q);
	}
	
}

class B extends A{
    
	protected void running() {
		System.out.println(k+q);
		System.out.println("자식");
	}
}



