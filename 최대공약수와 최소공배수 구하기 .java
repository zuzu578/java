import java.util.ArrayList;

public class NewCalCulator {
	

	public static void main(String[] args) {
	   int answer = 0 ;
		calcul a1 = new calcul();
		a1.cal();
	
	}
}
class calcul{
	
	
	
	//최대 공약수와 최소공배수를 구해보자 //
	//두수 (x와 y를 나누는 수가 공통으로 된 부분이 결국은 최대공약수이기때문에..//)
	//나누는 수를 담을 변수를 선언해줍시다.//
	
	int div;//(결국 나누는 수를 담을 변수이자 최대공약수가 될 변수입니다.//);
	
	//몫을 담을 변수를 선언해줍니다.//
	
	int x1 = 0; 
	int y1 = 0;
	
	int m = 0;
	
	
	calcul(){
	
	

		
		
		//그리고 그 나누는 수를 생성자 에서 초기화 작업을 해줍니다.//
		
		div = 0;
		
	}
	

	public void cal() {
		int x =20;
		int y =10;
	  
		for(int i = 1 ; i<=y; i++) {
		  //if문을 이용해서 반복을 제어해줍니다//
			//즉 나누는 수 i를 특정 조건에따라서 제한해줍니다//
			//우리는 i (나누는수가 x와 y 공통 부분이므로 둘을 나누었을때 0이 되고 아닌경우는 반복을 중단하게하는 제어문을 작성합니다//
			if(x%i==0 && y%i==0) {
				div = i;
				
				//x와 y를 공통으로 나누어지는 수 (i)와 계산을 하여 x y의 값을 각각 저장해준다 (몫을 저장);//
			    x1 = x/i;
			    y1 = y/i;
				
			}
			
			m = x1*y1*div;
			
			
		}
		
		System.out.println("최소공배수는"+m);
		System.out.println("최대공약수는"+div);
		
//		
		
		
		//최소공배수를 구해봅시다.//
		//최소공배수는 최대공약수*x와 y의 몫을 곱한갑 즉 //
		//div * x(몫)*y(몫) = 최소공배수;//
		//몫을 저장할 변수를 생성해준다 //
	
		
	}
	
	
	
}


	
