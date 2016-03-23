package com.shiro.learn;

public class MulThreadTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {

				public void run() {
					Test1 test = new Test1();
					for (int j = 0; j < 10; j++)
						test.addInt();
				}

				
			}).start();
		}
	}

}
class IdGenerator {
	private static int i = 1;

	public synchronized int getID() {
		return ++i;
	}

	private IdGenerator() {
	}

	private static IdGenerator single = null;

	// 静态工厂方法
	public static IdGenerator getInstance() {
		if (single == null) {
			single = new IdGenerator();
		}
		return single;
	}
}

class Test1 {

	public synchronized void addInt() {
		System.out.println(Thread.currentThread().getName() + "线程的ID是"
				+ IdGenerator.getInstance().getID());
	}
}
