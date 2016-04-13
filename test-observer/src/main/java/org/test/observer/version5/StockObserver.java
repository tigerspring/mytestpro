package org.test.observer.version5;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class StockObserver implements Observer{

	private String name;
	public StockObserver(String name){
		this.name = name;
	}
	
	public void update(Observable o, Object arg) {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(arg+"	" +this.name+"	关闭股票行情，回去工作！");
	}

}
