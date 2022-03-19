package kr.hs.study.beans;

public class TestBean {
	private int data1;
	private double data2;
	private boolean data3;
	private String data4;
	
	
	//Getter & Setter
	//Data1
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	//Data2
	public double getData2() {
		return data2;
	}
	public void setData2(double data2) {
		this.data2 = data2;
	}
	
	//Data3
	//boolean은 get이 아닌 isData이다
	public boolean isData3() {
		return data3;
	}
	public void setData3(boolean data3) {
		this.data3 = data3;
	}
	
	//Data4
	public String getData4() {
		return data4;
	}
	public void setData4(String data4) {
		this.data4 = data4;
	}
	
}
