package kr.hs.study.beans;

public class Basketball implements Sports{
	private String player;
	private int set;
	
	public void play() {
		System.out.print("농구는 "+this.player+"의 선수가 경기하며 ");
	}

	public void stop() {
		System.out.println(set + "쿼터 되면 멈춘다.");
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}
	
	
}
