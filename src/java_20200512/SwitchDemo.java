package java_20200512;

public class SwitchDemo {
	//switch 케이스보다는  if문을 주로 사용함
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		//month => 수식(char, byte, short, int, String)
		switch(month) {
		//case 평가값 => 반드시 유일해야 함 
		//ex. case12가 두 개면 error
		//case절에 break가 없으면 아래의 case로 이동한다
		//ex. case2에  break 안 걸면 12,1,2 모두 봄으로 결과가 나옴
		case 12:
		case 1 : 
		case 2 : season="겨울"; break;
		case 3 : 
		case 4 : 
		case 5 : season="봄"; break;
		case 6 : 
		case 7 : 
		case 8 : season="여름"; break;
		case 9 : 
		case 10: 
		case 11: season="가을"; break;
		default: season="없는 계절";
		//default가 맨마지막 문장일 경우에는 break를 안붙여도됨. 단, 중간에 들어가면 필수
		
		}
		
		System.out.println(month+"월은"+season+"입니다.");
		
	}

}
