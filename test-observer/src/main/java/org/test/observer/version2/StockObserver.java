package org.test.observer.version2;

import org.test.observer.version2.obserobj.Observer;

public class StockObserver extends Observer{

	
	public StockObserver(String name, Secretary secretary) {
		super(name, secretary);
	}

	public void update(){
		System.out.println(secretary.secretaryAction()+"	"+name+"	关闭股票行情，继续工作！");
	}
}
