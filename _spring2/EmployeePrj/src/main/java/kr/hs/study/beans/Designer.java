package kr.hs.study.beans;

public class Designer implements Employee {
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
		System.out.println("디자이너 " + this.checkinTime + "시 출근");
	}

	public void Checkout() {
		System.out.println("디자이너 " + this.checkoutTime + "시 퇴근");
	}
}
