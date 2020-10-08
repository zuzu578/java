
public class New {

	public static void main(String[] args) {
		
	int sum =0;
	
	 for(int i = 1; i<=5; i ++) {
		 sum = sum + i ;//i=1일때, 첫번쨰는 1+0 이므로 "1을 sum에 저장";
		                //i=2일때,두번째는 sum에 1을 저장한 값에 2를 더하므로 , "3을 저장함" sum에
		                //i=3일때 , 세번째는 저장한 3값에 3을 더하고 "6을 sum에 저장"
		                //i=4일때 네번째는 저장한 6값에 4를 더해서 "10을 저장"합니다.
		                //i=5일때 다섯번째는 저장한 10 값에5를더해서 "15를 저장"합니다.
		 System.out.println(sum);
			
		}
		
	  