package java_20200514;

//배열은 int[]a=;, String[]a=; 처럼 대괄호로 표현함
//"선언 -> 생성 -> 할당 -> 출력"
public class ArrayDemo {
	public static void main(String[] args) {
		//방법1
		//1. 배열을 선언 및 생성한다
		int[] a = new int[4];// a라는 변수에 4개의 방이 만들어진 것
		
		//2. 배열을 할당한다.
		a[0] = 1; // a의 0번째 방에 1을 할당한 것
		a[1] = 2; // a의 1번째 방에 2를 할당한 것
		a[2] = 3; // a의 2번째 방에 3을 할당한 것
		a[3] = 4; // a의 3번째 방에 4를 할당한 것
		
		//3. 배열을 출력한다.
		//a.length : 배열의 길이
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);//실행 : ctrl + f11
		}
		
		
		
		//방법2
		//1. 배열 선언, 생성, 할당을 동시에 실행
		int[] b = {100,200,300,400,500};
		//b의0번째에 100, b의 1번째에 200,...b의 4번째에 500
		
		//2-1. 배열출력 => for loop
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//2-2. 배열출력 => enhanced for loop
		for(int value : b) {
			System.out.println(value);
		}
		
		//*************************배열에서 주의할 부분*******************************
		
		int[] c = a; // a가 가르키는 객체(배열)와 c가 가르키는 객체와 같다
		c[0] = 11;   // 즉 c의 0번째 배열을 11로 바꾸면 a의 0번째 배열도 11로 바뀐다.
		
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		//int a1 = 10;   a1 -> 10 // a1이 가르키는 객체와 b1이 가르키는 객체는 각 각 10이다. 
		//int b1 = a1;   b1 -> 10 // a1과 b1이 가르키는 객체의 숫자는 같아도 같은 것을 가르키는 것은 아니다.
	
	
}
	
}
