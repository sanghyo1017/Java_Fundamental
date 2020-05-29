package java_20200520.step1;
//밀리세컨드로 경과시간을 알려주는 애플리케이션 만들기
public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000;
	}
	public static void main(String[] args) {
		
		FootStopWatch f1 = new FootStopWatch();
		
		//1970년 1월 1일부터 지금까지 시간을 밀리 세컨드로 반환.
		f1.startTime = System.currentTimeMillis();
		
		for(long i=0; i<7_000_000_000l; i++) {
			
		}
		
		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedTime();
		
		System.out.printf("경과시간 : %.3f", elapsedTime);
		//.3f => 소수점 아래 셋째자리까지 표현
		
		
	
	}

}
