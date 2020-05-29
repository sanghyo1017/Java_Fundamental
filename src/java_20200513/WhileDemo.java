package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=10) {
			sum +=1;
			i++;
			
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum);
		
		//구구단을 while문으로 작성
		//값을 선언하는 위치 체크 주의하기
		//i값을 선언하는 위치는 while(i-)문 밖에
		//j값을 선언하는 위치는 while(j-)문 밖에, while(i-)문 안에
		//i값의 증감을 선언하는 위치는 while(i-)문 안에, while(j-)문 밖에
		//j값의 증감을 선언하는 위치는 while(j-)문 안에
		
		i=2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				
				
				System.out.printf("%d * %d = %d*%n", i,j,i*j);
				j++;
			}
			
			i++;
		}
		
		
		
	
	}

}
