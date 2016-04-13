package org.test.observer;

import java.util.Observable;
import java.util.Observer;

import org.junit.Test;
import org.test.observer.version5.Boss;
import org.test.observer.version5.NBAObserver;
import org.test.observer.version5.Securaty;
import org.test.observer.version5.StockObserver;

/**
 * java库自带的观察者模式
 * @author Administrator
 *
 */
public class AppTest2 {

	@Test
	public void testVersion5(){
		Observable observable = new Boss();
		
		Observer stockObserver = new StockObserver("张飞");
		Observer stockObserver1 = new StockObserver("关羽");
		Observer stockObserver2 = new StockObserver("黄盖");
		observable.addObserver(stockObserver);
		observable.addObserver(stockObserver1);
		observable.addObserver(stockObserver2);
		
		observable.notifyObservers("我刘备回来了！");
	}
	
	@Test
	public void testVersion5_1(){
		Observable observable = new Securaty();
		
		Observer stockObserver = new StockObserver("张飞");
		Observer stockObserver1 = new NBAObserver("关羽");
		Observer stockObserver2 = new StockObserver("黄盖");
		observable.addObserver(stockObserver);
		observable.addObserver(stockObserver1);
		observable.addObserver(stockObserver2);
		
		observable.notifyObservers("老板刘备回来了！");
		
		System.out.println("1111111111111111111111111");
	}
}
