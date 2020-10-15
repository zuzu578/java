class Calculator{
	int left, right;
	public void sum(){
		System.out.println(left+right);
	}
	public void avg(){
		System.out.println((left+right)/2);
		
	}
	public void setOperands(int x, int y){
		this.left=x;
		this.right=y;
	}
}
public class CClass {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.setOperands(10, 20);
		c.sum();
		c.avg();
		
		c.setOperands(20, 40);
		c.sum();
		c.avg();
		
	}

}
