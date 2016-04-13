package org.test.observer.version3;

import org.test.observer.version3.observer.Observer;
import org.test.observer.version3.observer.Subject;

public class NBAObserver implements Observer {

	private Subject subject;
	private String name;
	
	public NBAObserver(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void update() {
		System.out.println(subject.subjectState()+"	"+name+"	关掉NBA比赛，回去工作！");
	}

}
