package org.test.observer.version1;

import org.test.observer.version2.Secretary;

public class StockObserver {

	private String name;
	private Secretary secretary; 
	
	public StockObserver(String name, Secretary secretary) {
		this.name = name;
		this.secretary = secretary;
	}

	public void update(){
		System.out.println(secretary.secretaryAction()+"	"+name+"	关闭股票行情，继续工作！");
	}
}
