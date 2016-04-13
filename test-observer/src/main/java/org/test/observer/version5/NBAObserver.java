package org.test.observer.version5;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class NBAObserver implements Observer {

	private String name;
	
	public NBAObserver(String name){
		this.name = name;
	}
	
	public void update(Observable o, Object arg) {
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(arg+"	"+this.name+"	关闭NBA比赛，回去工作了！");
	}

}
