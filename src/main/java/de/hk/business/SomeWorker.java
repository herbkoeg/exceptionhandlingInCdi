package de.hk.business;

import javax.ejb.Stateless;

import de.hk.exception.MyApplicationException;
import de.hk.exception.MyException;
import de.hk.exception.MyRuntimeException;

@Stateless
public class SomeWorker {

	
	public void doSomething(String someString) throws MyException, MyApplicationException {
		
		System.err.println("somstring: " + someString);
		
		if(someString.length() == 1) {
			throw new MyApplicationException();
		}
		
		if(someString.length() > 5) {
			throw new MyRuntimeException();
		}
		
		throw new MyException();
		
		
	}
	
}
