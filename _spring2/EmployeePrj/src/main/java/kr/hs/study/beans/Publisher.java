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
		System.out.println("�ۺ��� " + this.checkinTime + "�� ���");
	}

	public void Checkout() {
		System.out.println("�ۺ��� " + this.checkoutTime + "�� ���");
	}
}
