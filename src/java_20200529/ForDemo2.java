package java_20200529;

public class ForDemo2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1 ;i <= 10;i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);
		
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
			}
		}
		
		//9,8,7,,,2단까지
		
		for (int i = 9 ; i >=2 ; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
			}
		}
	}
}


