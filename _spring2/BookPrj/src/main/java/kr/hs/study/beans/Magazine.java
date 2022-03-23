package kr.hs.study.beans;

public class Magazine implements Book{
	private PersonInfo p;
	public Magazine(PersonInfo p){
		this.p = p;
	}
	
	public void buy() {
		System.out.println(p.getName() + "�� ���� '" + p.getBookTitle() + "'�� " + p.getPrice() + "���� ���.");
	}

	public void sell() {
		System.out.println(p.getName() + "�� ���� '" + p.getBookTitle() + "'�� " + p.getPrice() + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(p.getName() + "�� ���� '" + p.getBookTitle() + "'�� " + p.getPrice() + "���� �����.");
	}

}
