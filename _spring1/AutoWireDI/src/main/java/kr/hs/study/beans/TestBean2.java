package kr.hs.study.beans;

//byType : 멤버변수의 타입과 동일한 bean을 찾아 주입
//이때, 같은 type의 객체가 여러개 있으면 안된다. => error

public class TestBean2 {
	private DataBean2 data3;
	private DataBean2 data4;
	
	public DataBean2 getData3() {
		return data3;
	}
	public void setData3(DataBean2 data3) {
		this.data3 = data3;
	}
	public DataBean2 getData4() {
		return data4;
	}
	public void setData4(DataBean2 data4) {
		this.data4 = data4;
	}
	
}
