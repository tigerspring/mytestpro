package org.test.observer.version4;

import org.test.observer.version4.observer.Subject;


public class NBAObserver {

	private Subject subject;
	private String name;
	
	public NBAObserver(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void closeNBAPlay() {
		System.out.println(subject.getAction()+"	"+name+"	关掉NBA比赛，回去工作！");
	}


}
