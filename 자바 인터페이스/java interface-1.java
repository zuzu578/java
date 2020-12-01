package list.arraylist.implementation;
public interface newi {
	//*인터페이스는 생성자를 가질수없다*//
	//인터페이스에서 상수 , 메서드는 컴파일 하는 순간 자동으로 상수와 추상메서드로 바뀐다.//
	//참고로 자바 8이상 버전을 기준으로 인터페이스에서의 메서드 접근제어자는
	//default,private 만 사용이 가능하다.//
	final double PI = 3.14;
	final int ERROR = -999999;
    abstract int add(int num1,int num2);
    abstract int substract(int num1,int num2);
    abstract int times(int num1,int num2);
    abstract int divide(int num1,int num2);
    //하지만 java8에서는 default 메서드 /static 메서드를 사용함으로써 재정의하여 사용할수있다.//
    default void description() {
    	System.out.println("설명입니다.");
    }
    default int running(int x , int y) {
    	int k = 0 ;
    	int j = 0 ;
    	k = x;
    	j = y;
    	System.out.println("running");
    	R2();
    	
    	return k+j;
    }
    default void Usage() {
    	myPrivate();
    }
    //static 메서드 부분//
    static int speaking(int k, int l) {
    	int q = 0;
    	int p = 0;
    	q = k;
    	p = l;
    	System.out.println("speaking2");
    	return q+p;
    }
    static int total(int[]arr) {
    	int total = 0;
    	for(int i:arr) {
    		total+=i;
    	}
    	return total;
    }
    //private 메서드 사용방법//
    private void R2() {
    	System.out.println("R2");
    }
    
    private void myPrivate(){
    	System.out.println("myPrivate");
    	
    }
    //private static method 사용방법.//
    //1)default 메서드를 만들어서 거기 안에서 호출//
    //2)메인에서 default 메서드를 호출을한다.//
    default void Usage2() {
    	my1();
    }
    private static void my1() {
    	System.out.println("my1");
    }

}
