package kr.hs.study.beans;

public class ScoreBean {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int spring;
	private int total = 0;
	private double avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double printAvg() {
		this.avg = total/4;
		return avg;
	}
	
	
	//°è»ê method
	public int printTotal() {
		this.total = korean+english+math+spring;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
