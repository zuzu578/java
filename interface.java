package list.arraylist.implementation;
public class inter1 {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		Example e2 = new Example2("Parents running","Parents speaking interface");
		//upcasting(클래스의 묵시적 클래스형변환)//
		
		e2.running();
		e2.speaking();
		System.out.println(e2.add(x, y));
		System.out.println(e2.avg(x, y));
		System.out.println(e2.div(x, y));
		System.out.println(e2.multi(x, y));
		System.out.println(e2.sub(x, y));
		e2.de();
		inter01.running4();
		e2.Usage();
	}

}
abstract class Example implements inter01{
	Example(String string1 , String string2){
		
	}
	//must be overriding by implements class//
	@Override
	public void running() {
		System.out.println("Parents running");
	}
	public void speaking() {
		System.out.println("Parents speaking interface");
		
	}
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
	
	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	@Override
	public int multi(int x , int y) {
		return x*y;
	}
	
	
	
	
	
}
class Example2 extends Example{
	String s;
	String k; 
	Example2(String string1 ,String string2) {
		super(string1,string2);
		this.s = string1;
		this.k = string2;
	}
	

	public void running() {
		System.out.println(this.s);
		System.out.println("child Running interface");
		
	}

	@Override
	public void speaking() {
		System.out.println(this.k);
		System.out.println("child speaking interface");
		
	}
	

	
	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int avg(int x, int y) {
		// TODO Auto-generated method stub
		return (x+y)/2;
	}
	
}