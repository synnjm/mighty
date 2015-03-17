package Event;


public class EventHandler {
	private static EventHandler instance;
	public EventHandler getInstance(){
		if(instance == null) {
			instance = new EventHandler();
		}
		
		return instance;
	}

	public void addEvent(String parameter, int type) {

		Event event = new Event(type, parameter);
		runEvent(event);
	}

	private void runEvent(Event event) {

		switch (event.getType()) {
		case Event.TYPE_DRAW_CARD: {
			// TODO Request for a draw to player of this turn, listen to reply
			// and then if there is no problem, send ack message to every player
			break;
		}
		}
	}
	
}


