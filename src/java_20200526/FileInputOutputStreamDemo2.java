package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	
	public static void main(String[] args) {
		//ctrl+shift+o
		FileInputStream fis = null;
		//ctrl+shift+o
		FileOutputStream fos = null;
		
		try {
			//try/catch잡기 1번
			fis = new FileInputStream("c:\\dev\\jdk-14.0.1_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk2.exe");
			
			//값세기 = 해야할것
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			
			//fis.read(readBytes)
			//: FileInputStream에 8192바이트를 읽어서 readBytes에 저장하고 읽은 바이트 수를 반환한다
			//try/catch잡기 2번
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//try/catch잡기 3번
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
