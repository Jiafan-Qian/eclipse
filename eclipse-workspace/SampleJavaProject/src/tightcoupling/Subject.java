package tightcoupling;

public class Subject 
{
	Topic t = new Topic();
	
	public void startReading()
	{
		t.understand();
	}
}
