package java_20200525;
//예외처리하는 방법2 : throws
//=>메서드에서 발생된 예외를 호출한 메서드에게 넘겨주는 방법.
public class ThrowsDemo {
	public static int getDivide(int first, int second) 
			throws ArithmeticException {
		
		int result = first / second;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		try { 
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		int result = getDivide(first, second);
		System.out.printf("결과 : %.2f%n", result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하셔야 합니다.");
		}catch(NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("끝");
		
	}

}
