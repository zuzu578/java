

public class testfor {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.Running(3));
		B b1 = new B();
		b1.running();
		
		
	
}

}

class A{
	protected int  Running(int x) {
		if(x==1) {
			return x;
		}else {
			
			return Running(x-1)*x;
		}
		
		
	}
	
}
class B{
	protected  void running() {
		System.out.println("running");
		
  }
}

	




