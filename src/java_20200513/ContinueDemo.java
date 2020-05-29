package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i==6) continue;
			//i가 6일 때 멈추고 계속한다
			sum += i;
			
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.(단 6은 제외한다.)%n", 
				sum);
		
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if(j==5) continue;
				//j가 5일 때 멈추고 계속한다
				System.out.printf("%d * %d = %d%n", i,j,i*j);
				
			}
		}
		
		outter : for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if(j==5) continue outter;
				//j가 5일 때  끊는다 -> j안에 있으므로  i는 2~9까지 계속간다.
				System.out.printf("%d * %d = %d%n", i,j,i*j);
				
			}
		}
	}

}
