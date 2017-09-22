package ObserverPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;;

public enum EventDatabase {
	
	eventDatabase;
	private static int count;
	private static Map<String,Event> database;
	private static boolean isInitialized;
	
	public static EventDatabase getInstance() {
		initialize();
		return eventDatabase;
	}
	
	public static void initialize() {
		if(!isInitialized) {
			database = new HashMap<String, Event>();
			count = database.size();
		}
	}
	
	public void add(Event event) {
		database.put(event.getName(), event);
	}
	
	public Event getEvent(String eventName) {
		try 
		{
			return database.get(eventName);
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}

}
