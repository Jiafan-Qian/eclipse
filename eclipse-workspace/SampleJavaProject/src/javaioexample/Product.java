package javaioexample;

import java.io.Serializable;

public class Product implements Serializable{
	
	//transient: stop serialization of the data
	transient private int pid;
	private String pname;

}
