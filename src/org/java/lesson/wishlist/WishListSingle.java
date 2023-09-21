package org.java.lesson.wishlist;

public class WishListSingle {
	
	private String gift;
	
	public WishListSingle(String gift) {
		setGift(gift);
	}
	
	public String getGift() {
		return gift;
	}
	
	private void setGift(String gift) {
		this.gift = gift;
	}
	
	@Override
	public String toString() {
		return "Gift: " + getGift();
	}
}
