package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		//for(int 초기값; 조건; 증감;)
		for(int i=1 ;i<=10;i++) {
			sum += i;//sum = sum + i 
			//     초기값        ->  조건    -> 반복문장 -> 증감
			//1. i=1, sum=0 -> i<=10 -> sum=1 -> i++
			//2. i=2, sum=1 -> i<=10 -> sum=3 -> i++
			//3. i=3, sum=3 -> i<=10 -> sum=6 -> i++
			//4. i=4, sum=6 -> i<=10 -> sum=10-> i++ 
			// 이렇게 계속 반복되다가 조건 i<=10이 false가 되면 for문이 끝남
			//for문은 항상 초기값 -> 조건 -> 증감 -> 값 -> 조건 -> 증감 순으로 반복됨

		}
			System.out.printf("1부터 10까지의 합은 %d 입니다.", sum);
		
		//*****************2중 for문(for문 안의 for문);구구단*******************
		
				//2,3,4........9단
				for (int i = 2; i<=9; i++) {
					for (int j=1; j<=9; j++) {
						//1. i=2 j=1 -> i*j=2 
						//2. i=2 j=2 -> i*j=4
						//3. i=2 j=3 -> i*j=6
						//......
						//9. i=2 j=9 -> i*j=18
						//10. i=3 j=1 -> i*j=3
						//i와 j 둘 다 같이 증감하는게 아니라 i조건 안에 j가 있으므로
						//i는 그대로 있다가 j의 조건이 false가 되면
						//다시 i로 올라가서 값이 증감한다.
						System.out.printf("%d * %d = %d%n", i,j,i*j);
					}
					
							
				}
				
				
				//9,8,7.....2단
				
				for (int i = 9; i>=2; i--) {
					for (int j=1; j<=9; j++) {
						System.out.printf("%d * %d = %d%n", i,j,i*j);
					}
							
				}
				
				/*
				 
				 *----
				 **---
				 ***--
				 ****-
				 ***** 
				 
				 */
				
				for (int i = 0; i <= 5; i++) {
					for (int j = 0; j < i+1 ; j++) {
						System.out.print("*");
						//i=0 j=0 -> *=0
						//i=0 j=1 -> *=1
						//i=0 j=2 -> *=2
						
						
					}
					System.out.println();
					
				}

				
				for (int i = 0; i <= 5; i++) {
					for (int j = 0; j < 5-i ; j++) {
						System.out.print("*");
						//i=0 j=0 -> *=0
						//i=0 j=1 -> *=1
						//i=0 j=2 -> *=2
						
						
					}
					System.out.println();
				}
				
			/*
			 
			     * 
			    ** 
			   *** 
			  ****
			 *****
			  
			 */
				
				for (int i=0; i<5; i++) {
					int m = 5-(i+1);
					int n = i+1;
				}

	}
	
	

}
