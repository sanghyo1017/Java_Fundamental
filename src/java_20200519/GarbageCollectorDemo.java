package java_20200519;

public class GarbageCollectorDemo {
	public static void main(String[] args) {
		Admin a1 = null;
		a1 = new Admin();
		a1 = new Admin();
		a1 = null;
		
		a1 = new Admin();
		Admin a2 = a1;
		a1 = null; 
		a2 = null;
		// a1만 null할 경우 a2는 거비지콜렉터의 후보가 되지 않기 때문에 a2도 null을 해줘야함
	}
	

}
