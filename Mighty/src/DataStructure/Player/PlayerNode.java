package DataStructure.Player;

public class PlayerNode {
	private PlayerNode nextPlayer;
	private Player player;
	
	PlayerNode(Player player) {
		this.player = player;
		this.nextPlayer = null;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public PlayerNode getNextNode() {
		return nextPlayer;
	}
	
	public void setNextNode(PlayerNode node) {
		nextPlayer = node;
	}
}
