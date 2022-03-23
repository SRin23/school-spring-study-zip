package kr.hs.study.beans;

public class Publisher implements Employee {
	private int checkinTime;
	private int checkoutTime;
	

	public int getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(int checkinTime) {
		this.checkinTime = checkinTime;
	}

	public int getCheckoutTime() {
		return checkoutTime;
	}

	public void setCheckoutTime(int checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	public void Checkin() {
		System.out.println("ÆÛºí¸®¼Å " + this.checkinTime + "½Ã Ãâ±Ù");
	}

	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å " + this.checkoutTime + "½Ã Åð±Ù");
	}
}
