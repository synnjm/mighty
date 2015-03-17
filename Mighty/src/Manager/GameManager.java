package Manager;

import DataStructure.Contract;
import DataStructure.Game;
import DataStructure.User;
import DataStructure.Player.PlayerNode;
import DataStructure.Rule.Rule;
import Factory.RuleFactory;

public class GameManager {
	private Game game;

	public GameManager(User[] users) {
		Rule rule = RuleFactory.createRule(users.length);
		game = new Game();
		game.setRule(rule);
		game.setPlayerList(users);
	}
	
	public void initGame() {
		game.setStatus(Game.STATUS_CHOOSING_DECLARER);
		Contract contract = startContracting();
		if(contract == null) {
			initGame();
		}
		else {
			game.setBid(contract);
			startGame();
		}
	}
	
	private Contract startContracting() {
		Contract currentContract = null;
		PlayerNode playerNode = game.getPlayerList().getHeader();
		int defaultBid = game.getRule().getDefaultBid();
		
		while(true) {
			boolean dirtyFlag = false;

			if (defaultBid < game.getRule().getMinBid())
				return null;
			for (int i = 0; i < game.getPlayerList().getSize(); i++) {

				Contract bid = askForBid(playerNode.getPlayer().getuId(),
						currentContract, defaultBid);
				
				if (bid != null && currentContract != null
						&& bid.getNumber() != currentContract.getNumber()) {
					dirtyFlag = true;
					currentContract = bid;
				}

				playerNode = playerNode.getNextNode();
			}

			if (currentContract == null) {
				defaultBid--;
			} else if (!dirtyFlag){
				break;
			} else if (currentContract.getNumber() == 20)
				break;
		}
		
		return currentContract;
	}
	
	//TODO ask User with uId about bid. If user wants to bid, user should bid higher than currentBid. If not, return currentBid
	private Contract askForBid(String uId, Contract currentBid, int defaultBid) {
		return null;
	}
	
	private void startGame() {
		
	}
	
}
