package kr.hs.study.beans;

public class Novel implements Book{
	private PersonInfo p;
	
	public Novel(PersonInfo p){
		this.p = p;
	}
	
	public void buy() {
		System.out.println(p.getName() + "�� �Ҽ� '" + p.getBookTitle() + "'�� " + p.getPrice() + "���� ���.");
	}

	public void sell() {
		System.out.println(p.getName() + "�� �Ҽ� '" + p.getBookTitle() + "'�� " + p.getPrice() + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(p.getName() + "�� �Ҽ� '" + p.getBookTitle() + "'�� " + p.getPrice() + "���� �����.");
	}
}
