package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
	
	private String name;
	private int pendingEvent;
	private int passEvents;
	private int budget;
	
	public User(String name) {
		this.name = name;
		this.pendingEvent = 0;
		this.passEvents = 0;
		this.budget = 100;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable o, Object arg) {
		
	}
	

}
