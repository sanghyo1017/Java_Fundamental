package java_20200518;

public class MethodDemo {
	//9-17라인 -> 메서드를 정의
	//boolean 메서드의 반환값
	//instance 메서드 (isLeafYear, plus, divide 모두 메서드의 이름)
	//반드시 객체를 생성해야만 사용할 수 있는 메서드
	//int year : 매개변수(parameter)
	public boolean isLeafYear(int year) {
		//메서드의 반환값이 boolean이기 때문에 return value의 
		//value도 boolean이어야한다.
		boolean isLeaf = 
				year%4==0 && 
				year%100!=0 || 
				year%400==0;
		return isLeaf; 
	}
	public long plus(int first, int second) {
		return (long)first + (long)second;
	}
	
	public double divide(int first, int second) {
		return (double)first/(double)second;
	}
	
	//오름차순(ascending)
	//public int[] ascending(int[] array) {
		//for(int i = 0; i<array.length; i++) {
			//for(int j=0; j<array.length-(i+1); j++) {
				//if(array[j]>array[j+1]) {
					//int temp = array[j+1];
					//array[j+1] = array[j];
					
					
//				}
//			}
//		}
		
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		boolean test = m.isLeafYear(2000); //괄호 안의 숫자 ; argument
		if(test) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		
	//	int[] temp = {1,3,32,9,30,5,4};
		
	//	int[] result3 = m.ascending(temp);
	
	//	for(int value : result3) {
	//		System.out.println(value + "\t");
	//	}
		
	}

}
