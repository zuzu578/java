

public class testfor {

	public static void main(String[] args) {
		A c1 = new A();
		System.out.println(c1.Cal(100));
	
	}
	
}
class A{
	protected int Cal(int x) {
		if(x==0) {
			return 0;
			
		}else {
			
			return x+Cal(x-1);
			
		
		}
		
		
		
	}
	
	
}



