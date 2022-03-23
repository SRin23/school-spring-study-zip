package kr.hs.study.beans;

public class Developer implements Employee {
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
		System.out.println("개발자 " + this.checkinTime + "시 출근");
	}

	public void Checkout() {
		System.out.println("개발자 " + this.checkoutTime + "시 퇴근");
	}

}
