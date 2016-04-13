package org.test.observer.version2;

import org.test.observer.version2.obserobj.Observer;

public class NBAObserver extends Observer {

	
	public NBAObserver(String name, Secretary secretary) {
		super(name, secretary);
	}

	@Override
	public void update() {
		System.out.println(secretary.secretaryAction()+"	"+name+"	关闭NBA比赛，继续工作！");
	}

}
