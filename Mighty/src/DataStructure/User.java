package DataStructure;

public class User {
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getSocket() {
		return socket;
	}
	public void setSocket(String socket) {
		this.socket = socket;
	}
	public Friends getFriends() {
		return friends;
	}
	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public static final int STATUS_NOT_IN_GROUP = 0;
	public static final int STATUS_IN_GROUPT = 1;
	public static final int STATUS_PLAYING = 2;
	
	
	private String Id;
	private String socket;
	private Friends friends;
	private int status;
	private int gId;
	
	
}
