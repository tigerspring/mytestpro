package org.test.observer.version4;

import org.test.observer.version4.observer.Subject;



public class StockObserver{

	private Subject subject;
	private String name;
	
	public StockObserver(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void closeStockMarket() {
		System.out.println(subject.getAction()+"	"+name+"	停下查看股票，回去工作！");
	}

}
