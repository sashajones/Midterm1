package com.cisc181.core;



public class PersonException extends Exception {

	private Person p;
	
	public PersonException(Person p, String Message) {
		super(Message);
		this.p = p;
		
	}

	/**
	 * @return the p
	 */
	public Person getP() {
		return p;
	}
	
	
}
