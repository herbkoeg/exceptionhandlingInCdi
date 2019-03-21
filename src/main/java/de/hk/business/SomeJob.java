package de.hk.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import de.hk.exception.MyApplicationException;
import de.hk.exception.MyException;
import de.hk.exception.MyRuntimeException;

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
