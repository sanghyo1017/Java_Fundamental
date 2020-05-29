package java_20200514;

public class TwoArrayDemo {
	public static void main(String[] args) {
		
	//2차원 배열 역시 1차원 배열과 마찬가지로 순서가 같다
    //선언 -> 생성 -> 할당 -> 출력
		
		//1. 배열 선언 및 생성
		int[][] a = new int[3][2];//3개의 배열이 각 각 2개의 배열을 갖는다
		
		//2. 배열 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		//배열 선언 및 생성 및 할당 (=1번하고 2번 한 번에 코딩한 것)
		//int[][] b = {{10,20},{30,40},{50,60}};
		
		//3. 배열 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println( a[i][j]);
			}
			
		}
	}

}
