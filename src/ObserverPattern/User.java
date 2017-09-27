package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
	
	private String name;
	private int pendingEvent;
	private int passEvents;
	private int budget;
	private boolean eligiablity;
	
	public User(String name) {
		this.name = name;
		this.pendingEvent = 0;
		this.passEvents = 0;
		this.budget = 100;
		this.eligiablity = true;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable o, Object arg) {
		Event event = (Event) o;
		budget += event.getCost();
		if(budget <= 0) {
			eligiablity = false;
		}
	}

	public String getBudget() {
		if(!eligiablity) {
			return "Insufficient funds!";
		}
		return Integer.toString(budget);
	}

	public void setBudget(int newBudget){
		budget += newBudget;
	}
}
