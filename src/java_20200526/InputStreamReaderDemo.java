package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		System.out.print("입력하세요>");
		InputStream in = System.in;//표준 입력장치와 연결(=키보드)
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		byte [] b = new byte[100];
		try {
			//in.read(b) : 키보드에 입력을 기다리고 있는 것 -> enter -> 키보드에 입력한 데이터를 b에 저장
			
			int readByteCount = 0;
			
			while((readByteCount = in.read(b))!= -1) {
				String str = new String(b,0,readByteCount);
				System.out.println(str);
				System.out.print("입력하세요>");
			}
			
			
		
			
			
			
			
			
			
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
