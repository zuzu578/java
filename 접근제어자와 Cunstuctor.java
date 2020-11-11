

public class new2 {

	public static void main(String[] args) {
	  A a1 = new B(20,40);
	  a1.sum();
}
	
}
class A{
    int u ;
	int n ; 
	A(){
		
	}
	A(int x , int y){
	  this.u = x;
	  this.n = y;
	  
	}
	protected void sum() {
		System.out.println("parent"+(u+n));
	}
	
	
	
}

class B extends A{
	int q ;
	int w ;
	B(int o , int v){
	this.q = o;
	this.w = v;
	}
	 protected void sum() {
		System.out.println("child"+(q+w));
	}
}