package java_20200527;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarkteCapCrawlingDemo {
	public static void main(String[] args) {
		FileWriter fw = null;
		String url 
		= "https://coinmarketcap.com/currencies/bitcoin/historical-data/"
				+ "?start=20200301&end=20200527";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");
		
		System.out.println("날짜\t\t시가\t\t고가\t\t저가\t\t종가\t\t거래량\t\t총량");
		
		
		for(int i=0; i<trElements.size(); i++) {
			Element trElement = trElements.get(i);
			
			Elements tdElements = trElement.select("td");
			for(int j=0; j<tdElements.size(); j++) {
				Element tdElement = tdElements.get(j);
				System.out.print(tdElement.text()+"\t");
			}
			System.out.println();
		}

		//그냥 노답 왤캐 공부를 안하냐 상요야 대학생때처럼 살래,,? 제발 정 신 차려 으아악 
		//그렇지않으면 다음공부도 다다음공부도 어려워진다 오늘은 별로 안피곤하니까 
		//집가서 야구 보지말고 지그재그도 그만보고 게임도 하지말고 소설책도 읽지 말고
		//!!코딩!!책을 읽으라고!! 프린트라도 보라고 ! !
		//기텁도 들어가서 눈에 익게 반복해서 보고,, 딱 수,목,금이라도 공부하자,,,
		/*
		for(int i=0; i<trElements.size(); i++) {
			Element trElement = trElements.get(i);
			String date = trElement.child(0).text();
			String open = trElement.child(1).text();
			String high = trElement.child(2).text();
			String low = trElement.child(3).text();
			String close = trElement.child(4).text();
			String volume = trElement.child(5).text();
			String marketCap = trElement.child(6).text();
		}
		*/
		
		
		
		
		
	}

}
