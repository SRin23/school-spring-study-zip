package kr.hs.study.beans;

public class Baseball implements Sports{
	private String player;
	private String set;
	
	public Baseball(String player, String set){
		this.player = player;
		this.set = set;
	}
	
	public void play() {
		System.out.print("야구는 "+this.player+"의 선수가 경기하며 ");
	}

	public void stop() {
		System.out.println(set + "가 되면 멈춘다.");
	}

}
