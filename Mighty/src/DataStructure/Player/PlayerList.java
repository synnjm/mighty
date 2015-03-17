package DataStructure.Player;


public class PlayerList {
	
	private PlayerNode header;
	private int size;
	
	
	public PlayerList() {
		size = 0;
		header = null;
	}
	
	public int getSize() {
		return size;
	}
	
	public PlayerNode getHeader() {
		return header;
	}
	
	public PlayerNode getPlayerNode(int index) {
		if(index >= size) {
			return null;
		} else if (index < 0) {
			return null;
		}
		PlayerNode node = header;
		int count = 0;
		while(true){
			if(count == index) {
				break;
			}
			node = node.getNextNode();
			count++;
		}
		return node;
	}
	
	
	public void addPlayer(Player player) {
		if(size == 0) {
			PlayerNode newNode = new PlayerNode(player);
			header = newNode;
			header.setNextNode(header);
			size++;
		} else {
			PlayerNode node = header;
			while (true) {
				if (node.getNextNode() != header)
					node = node.getNextNode();
				else
					break;
			}
			
			PlayerNode newNode = new PlayerNode(player);
			newNode.setNextNode(header);
			node.setNextNode(newNode);
		}
	}
	
	
	
}


