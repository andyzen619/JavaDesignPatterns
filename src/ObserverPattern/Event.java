package ObserverPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;

public class Event extends Observable {
	
	private String name;
	private int cost;
	private String date;
	private boolean soldOut;
	
	public Event(String nameOfEvent, int costOfEvent, String dateOfEvent) {
		this.name = nameOfEvent;
		this.cost = costOfEvent;
		this.date = dateOfEvent;
		this.soldOut = false;
	}

	public String getName() {
		return name;
	}

	public int getCost(){
		return cost;
	}

	public void decreaseCost(int costChange) {
		int decrease = -costChange;
		cost += decrease;
		notifyObservers(decrease);
	}

	public void inscreaseCost(int costChange) {
		cost += costChange;
		notifyObservers(costChange);
	}

}
