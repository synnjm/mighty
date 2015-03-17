package DataStructure.Card;


public class Card {
	public Trump getTrump() {
		return trump;
	}
	public void setTrump(Trump trump) {
		this.trump = trump;
	}
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	private Trump trump;
	private Number number;
}
