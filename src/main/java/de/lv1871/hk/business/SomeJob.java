package de.lv1871.hk.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import de.lv1871.hk.exception.MyApplicationException;
import de.lv1871.hk.exception.MyException;
import de.lv1871.hk.exception.MyRuntimeException;

@Stateless
public class SomeJob {

	@Inject
	SomeWorker someworker;
	
	
	public void run(String someString)  {
		
		try {
			someworker.doSomething(someString);
		} catch (MyException e) {
			System.err.println("###### Catched MyException");
		} catch (MyRuntimeException e) {
			// ACHTUNG: Hier kommt er nie hin ...
			System.err.println("###### MyRuntimeException");
		} catch (MyApplicationException e) {
			System.err.println("###### Catched MyApplicationException");
		}
		
	}
	
	
	
}
