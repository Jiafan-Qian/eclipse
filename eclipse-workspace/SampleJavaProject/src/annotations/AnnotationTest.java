package annotations;

import java.lang.reflect.Method;

class AnnotationTest {
	
	@MyAnnotation(value1 = 10)
	public void printValue()
	{
		System.out.println("My annotation");
	}
	
	public static void main(String[] args) throws Exception
	{
		AnnotationTest at = new AnnotationTest();
		Method m = at.getClass().getMethod("PrintValue");
		MyAnnotation myannt = m.getAnnotation(MyAnnotation.class);
		System.out.println(myannt.value1());
	}

}
