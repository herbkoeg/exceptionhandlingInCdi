package de.lv1871.hk.business;

import javax.ejb.Stateless;

import de.lv1871.hk.exception.MyApplicationException;
import de.lv1871.hk.exception.MyException;
import de.lv1871.hk.exception.MyRuntimeException;

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
