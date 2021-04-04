package com.classboxes.cms.exception;

public class NotProperNameException extends RuntimeException
{

	/**
	 * this exception is throw at runtime when mobile number is wrong
	 */
	private static final long serialVersionUID = -6932979604318255383L;
	
	public NotProperNameException(String msg)
	{
		super(msg);
	}

}
