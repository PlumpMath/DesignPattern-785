package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer obs)
	{
		list.add(obs);
	}
	
	public void unregisterObserver(Observer obs)
	{
		list.remove(obs);
	}
	
	//notify all observers to update
	public void notifyAllObserver()
	{
		for (Observer obs : list)
		{
			obs.update(this);
		}
	}
}
