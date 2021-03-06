package de.shop.kundenverwaltung.rest;

import de.shop.kundenverwaltung.service.AbstractKundeServiceException;

/**
 * Exception, die ausgel&ouml;st wird, wenn die Attributwerte eines Kunden nicht korrekt sind
 */
public abstract class AbstractInvalidDateException extends AbstractKundeServiceException {
	private static final long serialVersionUID = 2113917506853352685L;
	
	private final String invalidDate;
	
	public AbstractInvalidDateException(String invalidDate) {
		super("Ungueltiges Datum: " + invalidDate);
		this.invalidDate = invalidDate;
	}
	
	public AbstractInvalidDateException(String invalidDate, Exception e) {
		super("Ungueltiges Datum: " + invalidDate, e);
		this.invalidDate = invalidDate;
	}
	
	public String getInvalidDate() {
		return invalidDate;
	}
}
