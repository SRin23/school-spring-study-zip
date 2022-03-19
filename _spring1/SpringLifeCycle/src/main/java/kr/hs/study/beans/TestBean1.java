package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("Test Bean1의 기본 생성자");
	}
	
	public void initMethod() {
		System.out.println("init method 호출");
	}
	
	public void destroyMethod() {
		System.out.println("destroy method 호출");
	}
}
