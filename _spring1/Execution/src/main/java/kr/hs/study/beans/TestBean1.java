package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1() 호출");
	}
	
	//overloading
	public void method1(int a) {
		System.out.println("method1(int) 호출 : " + a);
	}
	
	//overloading
	public void method1(String str) {
		System.out.println("method1(String) 호출 : " + str);
	}
		
	//overloading
	public void method1(int a, int b) {
		System.out.println("method1(int, int) 호출 : " + a + ", " + b);
	}
		
	//overloading
	public void method1(int a, String str) {
		System.out.println("method1(int, String) 호출 : " + a + ", " + str);
	}
	
	public void method2() {
		System.out.println("method2() 호출");
	}
}
