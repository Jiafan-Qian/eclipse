package regexexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pat = Pattern.compile(".s");
		Matcher m = pat.matcher("at");
		boolean result = m.matches();
		
		System.out.println("Charater is found " + result);
		
		System.out.println(Pattern.matches("[acd]","abcd"));;
		System.out.println(Pattern.matches("[acd]","a"));;
		System.out.println(Pattern.matches("[^acd]","itr"));
		System.out.println(Pattern.matches("[a-zA-z0-9]{6}","Arun33"));
		
	}
	

}
