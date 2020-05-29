package java_20200512;
//Ctrl + Shift + F = 자동으로 줄 맞춰주기
public class OperatorDemo {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = 0;
		double d = 0;
		
		//정수는   int, 실수는 double
		//a하고 b를xx해서 c(or d)에 할당한다.
		//나누기의 경우 실수가 나올 수 있으니 double로 캐스팅
		c = a+b;
		System.out.println(c);
		
		c = a-b;
		System.out.println(c);
		
		d = (double)b / a;
		System.out.println(d);
		
		c = a*b;
		System.out.println(c);
		
		//나머지 연산자
		c = b % a;
		System.out.println(c);
		
		a += b;//a = a+b;
		System.out.println(a);
		
		a -= b;//a = a-b;
		System.out.println(a);
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			//sum = sum + i ;
			sum += i;
		}
		System.out.println(sum);
		
		a = 10;
		b = 20;
		a++; // a = a+1; 
		++b; // b = b+1; 
		
		System.out.println(a);//11
		System.out.println(b);//21
		
		// 위 경우는 ++부호가 앞에 올 때와 뒤에 올 때 같은 경우
		
		
		c = a++;
		System.out.println(c);//11(대입 후 증가)
		
		c = ++b;
		System.out.println(c);//22(증가 후 대입)
		
		//위 경우는 ++부호가 앞에 올 때와 뒤에 올 때 다른 경우
		//but 이러한 코딩은 잘 쓰이지 않음 위 경우처럼 단독으로!!
		
		
		a = 10;
		b = 20;
		d = 10.0;
		
		boolean isSuccess = false;
		//등호, 부등호는 코딩하면 결과가  true or false를 반환한다.
		isSuccess = a >b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		//primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면 true를 반환한다.
		isSuccess = a ==  d;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		
		//논리연산자
		//&&연산은 모두 T여야 T가 나옴 즉, 앞에가 F면 뒤에는 안 봄
		//||연산은 하나만 T여도 T가 나옴 즉, 앞에가 T면 뒤에는 안 봄
		
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		a = 10;
		b = 20;
		
		//a && b => a가 false면 b를 연산하지 않음(short circuit)
		//a || b => a가 true면 b를 연산하지 않음(short circuit)
	
		isSuccess = (a==b) && (++a==b++);//(a==b)->false
		System.out.println(isSuccess);// false
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		b = 10;
		
		isSuccess = (a==b) || (++a==b++);
		System.out.println(isSuccess);// true
		
		
		
		// + => 연결연산자(두 개 중 1개 이상이 문자열일 경우), 산술연산자(두 개 모두 숫자일 경우)
		
		System.out.println(1+2+3+"456");// 6456 
		System.out.println("123"+4+5+6);// 123456 
		System.out.println("123"+(4+5+6));// 12315 
		System.out.println("123"+4+(5+6));// 123411
		System.out.println(1+2+"34"+(5+6));// 33411
		
		
		

		
		
		
	}
}
