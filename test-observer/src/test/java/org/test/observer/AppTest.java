package org.test.observer;

import org.junit.Test;
import org.test.observer.version2.NBAObserver;
import org.test.observer.version2.Secretary;
import org.test.observer.version2.StockObserver;
import org.test.observer.version2.obserobj.Observer;
import org.test.observer.version3.observer.Subject;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	/**
	 * 为解耦版本
	 */
	@Test
	public void testObserverVersion1(){
		Secretary secretary = new Secretary();
		
		
		
		StockObserver  stockObserver1 = new StockObserver("张飞",secretary);
		StockObserver  stockObserver2 = new StockObserver("关羽",secretary);
		StockObserver  stockObserver3 = new StockObserver("赵云",secretary);
		
		
		secretary.attach(stockObserver1);
		secretary.attach(stockObserver2);
		secretary.attach(stockObserver3);
		
		secretary.setAction("刘备来了！");
		secretary.secretaryAction();
		
		secretary.Notify();
	}

	/**
	 * 解耦观察者
	 */
	@Test
	public void testObserverVersion2(){
		
		Secretary secretary = new Secretary();
		
		
		
		Observer  stockObserver1 = new StockObserver("张飞",secretary);
		Observer  stockObserver2 = new StockObserver("关羽",secretary);
		Observer  stockObserver3 = new NBAObserver("赵云",secretary);
		
		
		secretary.attach(stockObserver1);
		secretary.attach(stockObserver2);
		secretary.attach(stockObserver3);
		
		secretary.setAction("刘备来了！");
		secretary.secretaryAction();
		
		secretary.Notify();
	}
	
	@Test
	public void testObserverVersion3(){
		Subject subject = new org.test.observer.version3.Secretory();
		
		
		org.test.observer.version3.observer.Observer observer1 = new org.test.observer.version3.StockObserver("张飞",subject);
		org.test.observer.version3.observer.Observer observer2 = new org.test.observer.version3.StockObserver("关羽",subject);
		org.test.observer.version3.observer.Observer observer3 = new org.test.observer.version3.NBAObserver("赵云",subject);
		
		subject.attache(observer1);
		subject.attache(observer2);
		subject.attache(observer3);
		
		subject.setState("刘备来了！");
		
		subject.Notify();
	}
	@Test
	public void testObserverVersion3_1(){
		Subject subject = new org.test.observer.version3.Boss();
		
		
		org.test.observer.version3.observer.Observer observer1 = new org.test.observer.version3.StockObserver("张飞",subject);
		org.test.observer.version3.observer.Observer observer3 = new org.test.observer.version3.NBAObserver("赵云",subject);
		
		subject.attache(observer1);
		subject.attache(observer3);
		
		subject.setState("我刘备回来了！");
		
		subject.Notify();
	}
	
	
}
