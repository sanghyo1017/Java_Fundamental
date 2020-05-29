package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctrl + shift + o
		//HashSet 객체의 중복을 허용하지 않고, 순서도 없음(순서를 보장하지 않음)
		//1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();
		
		//2. 할당
		set.add(1);//auto boxing
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(5);
		
		//3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
			
		}
	
	    HashSet<Customer> set1 = new HashSet<Customer>();
	    set1.add(new Customer("이상효1"));
	    set1.add(new Customer("이상효2"));
	    set1.add(new Customer("이상효3"));
	    set1.add(new Customer("이상효4"));
	
		System.out.println(set1.size());
		
		
		
		//로또 복권 -HashSet
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45)+1;
			lotto.add(random);
			if(lotto.size() ==6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
	}
	
}


