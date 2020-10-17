
public class idol {

	public static void main(String[] args) {
				//master yi //
		
		  
	      champion c = new champion();
	      //alpha strike = -100//
	      int skill1 =c.q(400, 100);
	      //meditate = -50 //
	      int skill2 =c.w(400, 50);
	      // e = 0;//
	      int skill3 =c.e(400, 0);
	      //ultimate = -100//
	      int skill4 =c.r(400, 100);
	      System.out.println(skill1);
	      System.out.println(skill2);
	      System.out.println(skill3);
	      System.out.println(skill4);
	      
	    
		
	}
	
 

}
class champion{

	public  int q(int x , int y) {
		int j =x-y;
		return j;
		
	}

	public int r(int x , int y) {
		int j = x-y;
		return j;
		
	}

	public int  e(int x, int y) {
		int j = x-y;
		
		return j ;
		
	}

	public int  w(int x , int y ) {
		int j = x-y;
		return j ;
		
	}
	
	
}

 
