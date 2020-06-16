package java_20200525;
//예외처리하는 방법 1 : try-catch-finally 
//=>예외가 발생한 메서드 내에서 처리하는 방법.
public class TryCatchDemo {
	
	public static double getAvg(int first, int second) {
		int sum =first+second;
		double avg = (double) sum / 2;
		return avg;
	}
	
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			
			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("예외 메세지"+e.getMessage());
			System.err.println("2개의 값을 모두 넣으세요");//에러메세지는 빨간색으로 출력됨
			e.printStackTrace();//에러가 어디서 발생했는지 나옴
			
			/* 일반출력 : System.out
			 * 에러출력 : System.err
			 */
			
		}catch(NumberFormatException e) {
			System.err.println("숫자를 넣으세요");
		}finally {
			System.out.println("finally");//에러가 난 상태든 아니든 finally는 항상 수행됨
		}
		
		//catch 블럭이 여러개 있을 경우 위에서부터 하위 클래스에서 상위클래스 순으로 정한다(맨마지막에는 최상위클래스)
	}

}
