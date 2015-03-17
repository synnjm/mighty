package Event;

public class Event {
	public static final int TYPE_DRAW_CARD = 1;
	
	
	private int type;
	private String param;

	public Event(int type, String param) {
		this.setType(type);
		this.setParam(param);
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
