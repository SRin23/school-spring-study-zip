package kr.hs.study.beans;

//byName : 멤버변수와 bean(객체)의 id(이름)이 같아야한다.
//Setter를 통한 DI처럼 저장된 객체의 setter를 불러와 자동으로 의존성을 주입한다.

public class TestBean1 {
	private DataBean1 data1;
	private DataBean1 data2;
	private DataBean1 data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자(AutoWire = byName)");
	}

	public DataBean1 getData1() {
		return data1;
	}

	public void setData1(DataBean1 data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}

	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}

	
	
}
