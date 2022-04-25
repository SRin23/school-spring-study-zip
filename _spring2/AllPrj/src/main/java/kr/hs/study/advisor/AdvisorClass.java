package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("before Method 호출");
	}
	
	public void afterMethod() {
		System.out.println("After Method 호출");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Method 호출");
		pjp.proceed();
		System.out.println("Around Method 호출 완료");
	}
	
	public void afterThrowingMethod(ArrayIndexOutOfBoundsException e) {
		System.out.println("After Throwing Method() 호출");
		System.out.println("e : " + e);
	}
	
	public void afterReturningMethod() {
		System.out.println("After Returning Method() 호출");
	}
}
//충고 advice 횡단관심사