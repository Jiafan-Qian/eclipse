package com.classboxes.cms.exception;

public class CustomerNotFoundException extends Exception
{

	/**
	 * If the customer does not exist this exception is used
	 */
	private static final long serialVersionUID = -7637082372127955168L;
	
	public CustomerNotFoundException(String msg)
	{
		super(msg);
	}

}
