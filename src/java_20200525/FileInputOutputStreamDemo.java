package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public FileInputOutputStreamDemo() {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		//입력, 출력 스트림
		
		try {
			fis = new FileInputStream("c:\\dev\\jdk-14.0.1_windows-x64_bin.exe");//읽을대상
			fos = new FileOutputStream("c:\\dev\\jdk.exe");///출력대상
			
			int readByte = 0;
			//fis.read() : 한바이트 읽어 반환한다. 더이상 읽을 바이트가 없으면 -1을 반환한다.
			//♥♥♥♥♥♥♥이 밑에 두줄(while문) 무조건 외워야함♥♥♥♥♥♥♥♥♥//
			while((readByte = fis.read()) != -1) {
				//fos.write(~) : 한 바이트 쓰기
				fos.write(readByte);
				//위엥서 읽은 바이트(readByte)를 그대로 바로 쓴 것 ; 한 바이트 읽고 한 바이트 쓴다
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			
			}catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
	
}