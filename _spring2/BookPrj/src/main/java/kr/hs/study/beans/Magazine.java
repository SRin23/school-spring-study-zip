package kr.hs.study.beans;

public class Magazine implements Book{
	private PersonInfo p;
	public Magazine(PersonInfo p){
		this.p = p;
	}
	
	public void buy() {
		System.out.println(p.getName() + "의 잡지 '" + p.getBookTitle() + "'을 " + p.getPrice() + "원에 산다.");
	}

	public void sell() {
		System.out.println(p.getName() + "의 잡지 '" + p.getBookTitle() + "'을 " + p.getPrice() + "원에 판다.");
	}

	public void create() {
		System.out.println(p.getName() + "의 잡지 '" + p.getBookTitle() + "'을 " + p.getPrice() + "원에 만든다.");
	}

}
