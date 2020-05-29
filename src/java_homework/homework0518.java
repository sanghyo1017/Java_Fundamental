package java_homework;

public class homework0518 {
	public static void main(String[] args) {
		int n = 2;
		int i = 2;
		int cnt = 0;
		
		while(n<=100) {
			
			i=2;
			while(i<=n) {
				if(n%i == 0) {
					if(n != i) {
						break;
					}
					else {
						System.out.print(n+" ");
						cnt++;
					}
				}
				i++;
			}
		n++;
		}
		System.out.println("\n소수의 개수 : " + cnt);
			
	}
	}
	