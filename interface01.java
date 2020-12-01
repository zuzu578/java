package list.arraylist.implementation;

public interface inter01 {
	//interface ==> 1)final,2)abstract method//
	final int k = 20 ;
	//must be overriding by implements class//
	abstract void running();
	abstract void speaking();
	abstract int add(int x, int y);
	abstract int sub(int x, int y);
	abstract int div(int x, int y);
	abstract int avg(int x, int y);
	abstract int multi(int x, int y);
	//default method//
	default void de() {
		System.out.println("default");
	}
	default void Usage() {
		p1();
	}
	//static//
	static void running4() {
		System.out.println("running4");
		
	}
	//private//
	private void p1() {
		System.out.println("p1");
	}
	
	

}
