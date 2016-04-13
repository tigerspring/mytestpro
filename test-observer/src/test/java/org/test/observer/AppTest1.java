package org.test.observer;

import org.junit.Test;
import org.test.observer.version4.Boss;
import org.test.observer.version4.NBAObserver;
import org.test.observer.version4.Secretory;
import org.test.observer.version4.StockObserver;

/**
 * 通过事件委托方式进行设计发布订阅模式
 * @author Administrator
 *
 */
public class AppTest1 {

	@Test
	public void testVersion4(){
		Boss boss = new Boss();
		boss.setAction("我刘备回来了！");
		
		NBAObserver nbaObserver = new NBAObserver("赵云",boss);
		
		boss.addListener(nbaObserver, "closeNBAPlay", new Object[0]);
		
		boss.notifyX();
	}
	@Test
	public void testVersion4_1(){
		Secretory secretory = new Secretory();
		secretory.setAction("老板刘备回来了！");
		
		NBAObserver nbaObserver = new NBAObserver("赵云",secretory);
		StockObserver stockObserver = new StockObserver("张飞",secretory);
		StockObserver stockObserver1 = new StockObserver("关羽",secretory);
		
		secretory.addListener(nbaObserver, "closeNBAPlay", new Object[0]);
		secretory.addListener(stockObserver, "closeStockMarket", new Object[0]);
		secretory.addListener(stockObserver1, "closeStockMarket", new Object[0]);
		
		secretory.notifyX();
	}
	
}
