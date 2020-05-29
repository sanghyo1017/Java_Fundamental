package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		
	//******코딩했을 때 오류가 나는 대표적인 경우들******// -Exception(예외)
		
		//1. NullPointerException 발생
		//String msg = null;
		//int msgLength = msg.length(); 
		//프린트앨앤 안해도됨 여기서 프로그램이 끝난 것
	
		//2. ArrayIndexOutOfBoundsException 발생
		//int[] array = {1,2,3};
		//int temp = array[3];
		
		//3. ArithmeticException 발생
		//int result = 3/0;
		//System.out.println(result);
		
		//4. NumberFormatException 발생
		int first = Integer.parseInt("a");
		System.out.println(first);
	}

}
