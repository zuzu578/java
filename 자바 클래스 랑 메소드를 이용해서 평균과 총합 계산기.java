import java.util.Scanner;
import java.util.ArrayList;
public class NewCalCulator {
	

	public static void main(String[] args) {
		   
		arrayCalcul ac1 = new arrayCalcul();
		ac1.buildCalcul();
		ac1.totalCalcul();

	}

}
 class	arrayCalcul{
	 Scanner sc1 = new Scanner(System.in);
	 ArrayList<Integer> al = new ArrayList<Integer>();
	 int sum = 0 ;
	arrayCalcul(){
		al = new ArrayList<Integer>();
	}
	 
public void totalCalcul() {
		for(int i = 0 ; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Your score is"+sum);
		System.out.println("Your average score is "+(sum/al.size())); 
		
	}

public void buildCalcul() {
	System.out.println("Please input your score");
	System.out.println("Cancel...press the 0 button");
	int point = sc1.nextInt();
	al.add(point);
	while(point>0) {
	
		sum=sum+point;
	    System.out.println("Please input your score");
	    point = sc1.nextInt();
	   
	}
	
	
}
}

