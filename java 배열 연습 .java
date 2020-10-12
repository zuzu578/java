
			   //양의 정수 10개를 입력받아 배열에 저장 ... 배열에 있는 정수중에서 3의 배수만 출력해보자 .//
			//문제가 정수 10개면 그만큼 배열 안에있는 엘레멘트갯 수도 10개라는 뜻이다//
			
			
			
			Scanner sc= new Scanner(System.in);
			
			 int[]a = new int[10];
			
			
			
				
				
				for(int i = 0 ; i<10 ; i++) {
					
					System.out.println("정수 10개를 입력해주세요.");
					int n = sc.nextInt();
					
					 n=n+a[i];
					 if(n%3==0) {
						 System.out.println(n);
					 }
				   
					 
				
					 
				}
			            
			
			 
			
			
			