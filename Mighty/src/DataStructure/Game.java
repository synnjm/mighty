package DataStructure;

import DataStructure.Card.Card;
import DataStructure.Card.Trump;
import DataStructure.Player.Player;
import DataStructure.Player.PlayerList;
import DataStructure.Player.PlayerNode;
import DataStructure.Rule.Rule;

public class Game {
	public static final int STATUS_SETTING_UP = -1;
	public static final int STATUS_CHOOSING_DECLARER = 0;
	public static final int STATUS_PLAYING_GAME = 1;
	private Rule rule;
	private PlayerList playerList;
	
	private Contract contract;
	private Card jokerCall;
	private Card mighty;
	
	private int round;
	private PlayerNode lead;
	private PlayerNode thisTurn;

	private Card[] drawnCard;
	
	private int status;
	
	public Game() {
		rule = null;
		playerList = new PlayerList();
		jokerCall = null;
		mighty = null;
		round = 0;
		lead = null;
		thisTurn = null;
		drawnCard = null;
		status = STATUS_SETTING_UP;
	}
	
	public Player getNextPlayer() {
		return thisTurn.getPlayer();
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public PlayerList getPlayerList() {
		return playerList;
	}

	/**
	 * Make PlayerList with users array
	 * @param users
	 */
	public void setPlayerList(User[] users) {
		for(User u : users) {
			Player player = new Player();
			player.setuId(u.getId());
			playerList.addPlayer(player);
		}
	}

	public Card getJokerCall() {
		return jokerCall;
	}

	public void setJokerCall(Card jokerCall) {
		this.jokerCall = jokerCall;
	}

	public Card getMighty() {
		return mighty;
	}

	public void setMighty(Card mighty) {
		this.mighty = mighty;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int totalTurn) {
		this.round = totalTurn;
	}

	public PlayerNode getLead() {
		return lead;
	}

	public void setLead(PlayerNode firstTurn) {
		this.lead = firstTurn;
	}

	public PlayerNode getThisTurn() {
		return thisTurn;
	}

	public void setThisTurn(PlayerNode thisTurn) {
		this.thisTurn = thisTurn;
	}

	public Card[] getDrawnCard() {
		return drawnCard;
	}

	public void setDrawnCard(Card[] drawnCard) {
		this.drawnCard = drawnCard;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Contract getContract() {
		return contract;
	}

	public void setBid(Contract contract) {
		this.contract = contract;
	}

}

