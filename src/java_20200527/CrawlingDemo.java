package java_20200527;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	
	public static void main(String[] args) {
		
		/*
		String url = "http://www.imbc.com/";
		
		//html 문서 전체를 관리하기 위한 객체
		Document doc = null;
		
		try {
			//url로 연결하여 html 정보를 get 방식으로 가져온다.
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성공");
		
		//html 정보에서 class 정보를 가져올 때는 '.'으로 가져온다 / id 정보를 가져올 때는 '#'
		Elements elements = doc.select(".notice-list li");
		
		for(int i=0; i<elements.size(); i++) {
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
		
		}
		*/
		
		String url = "https://sports.news.naver.com/kbaseball/index.nhn";
		
		Document doc = null;
		
		//doc.Jsoup.connect(url).get();
		
		
		

		
	}
//	Elements elements = doc.select(".home_news");
//	Elements lielements = elements.select(".hime_news_list_li");


}
