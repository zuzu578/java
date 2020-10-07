
import java.util.Scanner;
public class project {

	public static void main(String[] args) {
      
		Scanner id = new Scanner(System.in);
		Scanner pwd = new Scanner(System.in);
		
		String str = id.nextLine();
		if(str.equals("dlwnghks6821")){
		   String str1 = pwd.nextLine();
		  if(str1.equals("1111")) {
			  System.out.println("hello");
		  }else {
			  System.out.println("wrong password");
		  }
	

}else {
	System.out.println("wrong id");
}
	}
}
