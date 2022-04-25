package kr.hs.study.advices;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {

	public void beforeMethod() {
		System.out.println("Before Method 호출");
	}
	
	public void afterMethod() {
		System.out.println("After Method 호출");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Method 호출");
		pjp.proceed();
		System.out.println("Around Method 끝");
	}
	public void afterReturningMethod() {
		System.out.println("After Returning Method 호출");
	}
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowing 호출");
		System.out.println("e : " + e);
	}
}
