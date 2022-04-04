package kr.hs.study.beans;

public class Vollyball implements Sports{
	private String player;
	private int set;
	
	public Vollyball(String player, int set){
		this.player = player;
		this.set = set;
	}
	
	public void play() {
		System.out.print("배구는 "+this.player+"의 선수가 경기하며 ");
	}

	public void stop() {
		System.out.println(set + "세트가 되면 멈춘다.");
	}
}
