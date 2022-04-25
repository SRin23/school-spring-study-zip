package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("before Method ȣ��");
	}
	
	public void afterMethod() {
		System.out.println("After Method ȣ��");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Method ȣ��");
		pjp.proceed();
		System.out.println("Around Method ȣ�� �Ϸ�");
	}
	
	public void afterThrowingMethod(ArrayIndexOutOfBoundsException e) {
		System.out.println("After Throwing Method() ȣ��");
		System.out.println("e : " + e);
	}
	
	public void afterReturningMethod() {
		System.out.println("After Returning Method() ȣ��");
	}
}
//��� advice Ⱦ�ܰ��ɻ�