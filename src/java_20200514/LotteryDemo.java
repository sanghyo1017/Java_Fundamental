package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
	
		//로또복권
		//1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		//2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.
		//Math.random() => 0보다 크거나 같고 1보다 작은 양수를 
		//double 값으로 반환한다. 0.00000 ~ 44.999999999
		
		// 1부터 45에서 임의의 랜덤값을 반환한다.
		
		//1.배열 선언 및 생성
		int[] lotto = new int[6];//lotto의 배열 6가지
		
		//2-1. 배열을 할당
		for(int i=0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45)+1;
			//lotto의 배열은 0부터 시작하며 하나씩 증가한다.
			//lotto의 값은 랜덤이며 0부터 45.9까지의 수 중 정수만 사용한다.(int처리했음)
			
//*****//2-2. 중복되는 값이 있는지 체크하는 변수 -> for문 안의 if문*************************************
		boolean isExisted = false;
		//배열에서 중복되는 값이 존재하면 false
		
		//중복 체크하는 코드
		for(int j=0;j<i;j++) { //기준이 i인 점 주의. 
			//j는 중복을 체크하는 코드로 초기값은 0이고 범위는 i까지이며 1씩 증가한다.
			if(lotto[j] == random) {
				isExisted = true;
				break;
			}
		}
		
		if(!isExisted) {
			lotto[i] = random;
		}else {
			i--;
		}

		}
		//bubble sort(ascending)
		
		for(int i = 0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length - (i+1); j++) {
				if(lotto[j] < lotto[j+1]); {
					int temp = lotto[j+1];
				    lotto[j+1] = lotto[j];
				    lotto[j] = temp;				    
			}
			
	
		}
		
	}
		
	
		
		//3. 배열을 출력
		for(int value : lotto) {
			System.out.print(value+"\t");
		}
		
		
		
	}

	
}

//이런 코딩은 외우는 것 추천
