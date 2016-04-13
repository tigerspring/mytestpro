package org.test.observer.version3;

import org.test.observer.version3.observer.Observer;
import org.test.observer.version3.observer.Subject;

public class StockObserver implements Observer {

	private Subject subject;
	private String name;
	
	public StockObserver(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void update() {
		System.out.println(subject.subjectState()+"	"+name+"	停下查看股票，回去工作！");
	}

}
