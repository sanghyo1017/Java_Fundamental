package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo4.java");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw,true);//autoFlush
			
			String readLine = null;
			//br.readLine() : 개행을 뺀 한 줄을 읽음
			while((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();//개행을 붙여줌
			}
			
		//	bw.flush();
			
		//생각해보니 고딩떄 다닌던 독서실 총무들 지금 내 나이 언저리일텐데 꼰대처럼 행동한거 어이없네
		//대학독서실, 세그루독서실,,, 또 기억 안나는데 대독은 진짜 X같다.
		//그래도 친구들이랑 남친이랑 대독 다니면서 행복하고 재밌었는데.. 물론 그 순간만 ㅡㅡ,,
		//총무님 지금 모하세요..? 그 때 친구들도 지금 모하니..? 궁금하다 보고싶어 얘들아
		//그리고 나 싫어하던 그 여자애... 걔 이름 뭐였지 미경이가 알려줬는데,, 아무튼 x같아 개싫어!!
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
				try {
					if(fr != null) fr.close();
					if(fw != null)fw.close();
					if(br != null)br.close();
					if(bw != null)bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
		
	}

}
