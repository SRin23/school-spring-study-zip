package kr.hs.study.advices;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {

	public void beforeMethod() {
		System.out.println("Before Method ȣ��");
	}
	
	public void afterMethod() {
		System.out.println("After Method ȣ��");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Method ȣ��");
		pjp.proceed();
		System.out.println("Around Method ��");
	}
	public void afterReturningMethod() {
		System.out.println("After Returning Method ȣ��");
	}
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowing ȣ��");
		System.out.println("e : " + e);
	}
}
