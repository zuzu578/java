

public class NewCalCulator {
	

	public static void main(String[] args) {
		sum1 s1 = new sum1();
		//최대 공약수 를 위한 인스턴스//
		s1.calculate(18,24);
		//최소공배수를 위한 인스턴스//
	    s1.calculate2(18, 24);
	    //최대공약수를 위한 메소드//
	    System.out.println(s1.calculate(18,24));
	    //최소공배수를 위한 메소드//
	    System.out.println(s1.calculate2(18,24));
	   
	}
	
}
class sum1{
	int j;
	int p;
	int k;
	int l; 
	int q;
	
	sum1(){
		j=1;
		p=1;
		k=1;
		l=1;
		q=1;
		
		
	}

	public int calculate2(int k, int l) {
		for(int i =1 ; i<=24; i++) {
			if(k%i ==0 && l%i ==0) {
				p=(k/i);
				this.k=(l/i);
				
			}
			
		}
		q = p*this.k*j;
	
		return q;
		
		
	}

	public int calculate(int x , int y) {
		for(int i =1 ; i<=24 ; i++) {
			if(x%i == 0 && y%i ==0) {
				p=i;
				
				
			}
		}
		
		 j = p;
		return j ;
	}
	
}
