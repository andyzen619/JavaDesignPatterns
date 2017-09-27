package ObserverPattern;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EventSimulation {

    public static void main(String[] args) {

        UserDatabase userDatabase = UserDatabase.getInstance();
        EventDatabase eventDatabase = EventDatabase.getInstance();

        Event yellowClaw = new Event("Yellow Claw", 40, new Date().toString());
        Event galantis = new Event("Galantis", 60, new Date().toString());
        Event showtek = new Event("ShowTek", 100, new Date().toString());

        eventDatabase.add(yellowClaw);
        eventDatabase.add(galantis);
        eventDatabase.add(showtek);
        List<Event> listOfEvents = eventDatabase.database.values();

        Random r = new Random();

        for(int i = 0; i < 10; i++ ) {
            int id = new Random().nextInt(100);
            String name = Integer.toString(id);
            User user = new User(name);
            user.setBudget(r.nextInt(300));
            userDatabase.add(user);
            System.out.println(user.getName() + " " + "Budget: " + user.getBudget() + "\n");
        }

        System.out.println(userDatabase.getCount());

        for(Event event: eventDatabase)


    }
}
