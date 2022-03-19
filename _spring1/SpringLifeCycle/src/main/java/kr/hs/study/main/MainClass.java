package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		//xml ���� �ε���, ��ü ����
		//��ü�� ȣ������ �ʾƵ� config�� �ִ� ��ü�� �⺻�����ڰ� ȣ���
		//Spring�� ��ü�� xml���� �ε��� �ڵ����� �����ȴ�
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml"); �� �����̳ʵ� ���� ����Ѵ�!!
		
		//�̶� ��½�, t1��ü�� �⺻�����ڸ� ����̵ȴ�.(t1�����ڴ� xml ������ �ε��ɶ� ��ü�� �����Ǳ� ����) lazy-init
		
		//�� ����
//		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
//		TestBean1 obj2 = ctx.getBean("t1", TestBean1.class);
//		TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
//		TestBean1 obj4 = ctx.getBean("t2", TestBean1.class);
		TestBean1 obj5 = ctx.getBean("t3", TestBean1.class);	//������ 2�� ȣ�� ��, init�⺻������ ����(lazy������)
		
		//�� ���(�� ��ü�� �ּҰ� ������ �� �� �ִ�.)
//		System.out.println("obj1 : " + obj1);
//		System.out.println("obj2 : " + obj2);
		
		//�� ��ü�� �ּҿʹ� �ٸ��� �� �� �ִ�.
		//scope = "prototype"�� ���� ���� ��ü�� ����Ű�� obj3�� obj4�� �ٸ� �ּҰ��� ��´ٴ� ���� �� �� �ִ�.
		//���� scope����, lazy-init = "true"�� ���������� �Ǿ�� �Ѵ� -> ���������� �������� ���� ���, xml�ε��� ��� ��ü�� �����ع���, �̹� ������� ��ü�� ������ ����� �״�
//		System.out.println("obj3 : " + obj3);
//		System.out.println("obj4 : " + obj4);
		
		
		System.out.println("obj5 : " + obj5);
		
		//ctx ���� -> bean�Ҹ� -> container���� bean���� ��������.
		ctx.close();
		//ctx.close��, destroy-method ����
	}

}
//�ѹ� ��ü�� �����ϸ� ����ؼ� ���� ����� �̱����̶�� �ϸ�, Spring�� �⺻������ �̱��� ����� ����̴�.
//�������� �⺻������ singleton�̴�. �ѹ������Ǹ� ��� ����Ѵ�.

//������� �ʴ� ��ü�� xml�� �����ϸ� �����ȴ� -> �̴� �޸� ���� -> config���� lazy-init = "true"�� �����Ͽ� �޸� ���� �ּ�
//lazy-init = "true"�� ����� xml���� �ε��� �����Ǵ� ��ü�� ����ڰ� ��ü�� ����Ҷ�(getBean�޼��� ȣ���) ��ü�� �����ϰ� �Ǿ� �޸� ���� �پ���.

//1. 
//2. lazy-init = "true" : 
//3. scope = "prototype" : 
//4. ctx.close()
//5. init-method() : ������ ���� �ڵ����� ����Ǵ� �޼��带 �����ϴ� �ɼ�
//6. destroy-method() : ��ü �Ҹ� ������ �ڵ����� ����Ǵ� �޼���(ctx.close() �ٷ� ���� ����Ǵ� �޼��带 ���Ѵ�.)