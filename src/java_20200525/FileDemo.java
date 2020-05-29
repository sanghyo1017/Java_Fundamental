package java_20200525;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class FileDemo {
	public static void main(String[] args) {
		//File 클래스
		//1. ♥디렉토리 생성
		//2. ♥파일 크기, 파일 이름, 파일 경로, 파일 날짜
		//3. ♥파일 생성 및 삭제
		//4. ♥파일 이름 변경
		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		
		File f2 = new File("C:\\dev\\jdk-14.0.1_windows-x64_bin.exe");
		long fileSize = f2.length()/1024;
		System.out.println(fileSize + "KB");
		
		String fileName = f2.getName();
		System.out.println(fileName);
		
		String path = f2.getPath();
		System.out.println(path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용프로그램");
			
		}else if(fileName.endsWith("pdf")) {
			System.out.println("pdf파일");
			
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축(zip)파일");
		}
		
		//1970년 1월 1일부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환한다. 
		long lastModified = f2.lastModified();//1589169024479
		System.out.println(lastModified);
		
		
		long mills = 1589169024479l;
		String pattern = "yyyy-MM-dd (a) HH:mm:ss.SSS";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		String date = (String)formatter.format(new Timestamp(mills));
		System.out.println(date);
		
		
		File f3 = new File("c:\\dev\\Hello.java");
		try {
			f3.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//f3.delete();
		
		File f4 = new File("c:\\dev\\HelloWorld.java");
		
		f3.renameTo(f4);
		

				
		
	}

}
