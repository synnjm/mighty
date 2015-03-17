package DataStructure.Player;

import DataStructure.Card.Card;

public class Player {
	private Card[] cards;
	private String uId;
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	
}
