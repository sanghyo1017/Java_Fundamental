package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	//setter, getter를 만들어야 이를 변경할 수 있음(현재는 private)
	//여기까지 만들고 단축키 사용~ but 손에 익지 않으면 그냥 치는게 나음
	
	
	//디폴트 생성자
	//alt + shift + s => c
	public Admin() {
		super();//부모 클래스의 디폴트 생성자를 호출
	}	
	
	//생성자(Constructor)
	//생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	//생성자의 역할은 인스턴스 변수 초기화
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	//생성자의 오버로딩
	public Admin(String id, String pwd, String email) {
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		this(id,pwd,email,0);//이 this는 다른 생성자를 호출, 반드시 생성자에서만 호출 가능
		//this의 용법 2가지
		//1. 자기 자신 객체 => this.
		//2. 다른 생성자를 호출 => this(~,~,,,,~)
		
		
		
	}
	
	//id에 대한 setter메서드
	public void setId(String id) {
		this.id = id;
	}
		
	//id에 대한 getter메서드
	public String getId() {
		return id;
	}
	
	//pwd에 대한 setter메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//pwd에 대한 getter메서드
	public String getPwd() {
		return pwd;
	
	}
	
	//email에 대한 setter메서드
	public void setEmail(String email) {
		this.email = email;
	}
	
	//email에 대한 getter메서드
	public String getEmail() {
		return email;
	}
	
	//level에 대한 setter메서드
	public void setLevel(int level) {
		this.level = level;
	}
	
	//level에 대한 getter메서드
	public int getLevel() {
		return level;
	}
		
	
}
