package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin();
		//new Admin이 에러나는 경우? -> admin class에 디폴트 생성자가 없을 확률 높음
		//a.id ="shshsh1017"; //id가 private이기 때문에 접근 불가
		//값을 가져오기 위해서는 메서드를 통해서만 가능
		//a.setId("shshsh10171017");
		//a.setPwd("123456");
		//a.setEmail("shshsh10171017@gmail.com");
		//a.setLevel(1);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		
		Admin a1 = new Admin("shshsh1017","1234","asd@naver.com");

		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
		
	}
	

}
