package ObserverPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum UserDatabase {
	
	userDatabase;
	private static Map<String, User> database;
	private static int count;
	private static boolean isInitialzed;
	
	public static UserDatabase getInstance() {
		initialize();
		return userDatabase;
	}
	
	private static void initialize() {
		if(!isInitialzed) {
			database = new HashMap<String, User>();
			count = database.size();
		}
	}
	
	public void add(User user) {
		database.put(user.getName(), user);
	}
	
	public User getUser(String name) {
		try
		{
			return (User) database.get(name);
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int getCount() {
		return count;
	}

}
