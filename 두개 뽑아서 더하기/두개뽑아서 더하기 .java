import java.util.Scanner;
import java.util.ArrayList;

public class Example {
        

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList s = new ArrayList();
		
		
		int[] n1 = {1,2,3,4,5,6,};
 
		int sum1 = 0 ;
		int sum2 = 0 ;
		int sum3 = 0 ;
		int sum4 = 0 ;
		int sum5 = 0 ;
		
		for(int i = 1 ; i <= 5 ; i=i+1) {
			sum1= n1[0]+n1[i];
			s.add(sum1);
			
			sum2 = n1[1]+n1[5];
			
			sum3 = n1[2]+n1[5];
		
			sum4 = n1[3]+n1[5];
			
			sum5 = n1[4]+n1[5];
			
	
		}
	    a1.add(s);
		a1.add(sum2);
		a1.add(sum3);
		a1.add(sum4);
		a1.add(sum5);
		//느낀점 ... 아...어레이리스트 안에 어레이리스트를 넣을수 있구만..//
		
       System.out.println(a1);
		
		
	}
	
}

