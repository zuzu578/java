import java.util.Scanner;

public class testfor {
	static Scanner sc1 = new Scanner(System.in);
	static int sum1=0;
	public static void main(String[] args) {
		
		System.out.println("점수를 입력해주세요.");
		int point = sc1.nextInt();
		while(point!=0) {
			sum1= sum1+point;
			System.out.println("점수를 입력해주세요.");
			point = sc1.nextInt();
			
		}
		System.out.println(sum1);
		
		
		int num1 = 10;
		int num2 = 20;
		int sum = add(num1,num2);
		System.out.println(sum);
		A b1 = new A(10,20);
		b1.running();
		c c1 = new c();
		d d1 = new d();
		d1.running();
		cls c4 = new cls();
		c4.print();
		
		
}

	private static int add(int num1, int num2) {
		int result = num1+num2; 
		return result;
	}
}
class C8{
	 String name;
	 int age;
	 String x;
	 int y;
	 C8(){
		 //생성자에서 다른생성자를 호출할때는 반드시 먼저 호출해주어야한다.//
		 this("lee",20);
		 this.x = "hell";
		 this.y = 40;
		 //this를 사용하여서 C8의 생성자를호출하였다.//
	 }
	 	//전달해주고있다//
	public C8(String string, int i) {
		name = string;
		age = i;
		
	}
}
class cls{
	protected void print() {
		System.out.println(this);
	}
}

class A{
	int a;
	int b;
	
	A(int x, int y){
		this.a = x;
		this.b = y;
	}
	protected void running() {
		System.out.println("running1");
		System.out.println(this.a+this.b);
	}
	
	
	
}
class B extends A{

	B(int x, int y) {
		super(x, y);
		
	}
	
	
	
}
class c{
	c(int x ,int y){
		int n =x+y;
		return;
		
	}

	public c() {
		
	}

	 
}
class d{
	d(String pname){
		
	}
	d(){
		
	}
	protected void running() {
		System.out.println("running01");
	}
	
}
class f{
	protected int k ;
	private int l ;
	
	private void speaking() {
		System.out.println("private");
	}
	private void saying() {
		System.out.println("saying");
		System.out.println(this.k+this.l);
	}

}
class e extends f{
	void text() {
		//System.out.println(this.k+this.l);
	}
}


