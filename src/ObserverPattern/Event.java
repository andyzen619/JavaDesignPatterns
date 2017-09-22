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
	private Map<String, User> observers;
	
	public Event(String nameOfEvent, int costOfEvent, String dateOfEvent) {
		this.name = nameOfEvent;
		this.cost = costOfEvent;
		this.date = dateOfEvent;
		this.soldOut = false;
		observers = new HashMap<String, User>();
	}

	public String getName() {
		return name;
	}
	
	public void subscribeObserver(User user) {
		observers.put(user.getName() , user);
		
	}

	public void changeCost(int cost) {
		this.cost = cost;
		for(User user : observers.values()) {
			user.update(this, null);
		}
	}

	public int getCost(){
		return cost;
	}

}
