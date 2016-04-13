package org.test.observer.version3.observer;


public interface Subject {

	void attache(Observer ob);
	void detache(Observer ob);
	void Notify(); 
	String subjectState();
	void setState(String str);
	
}
