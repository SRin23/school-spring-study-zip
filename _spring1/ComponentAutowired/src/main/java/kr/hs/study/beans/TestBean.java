package kr.hs.study.beans;
import javax.management.ConstructorParameters;

//생성자를 통한 자동주입
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("t1")
public class TestBean {	
	private int data1;
	private String data2;
	
	private DataBean3 data3;
	
	private DataBean4 data4;
	
	/*
	 * @Autowired 
	 * public TestBean(DataBean3 data3, DataBean4 data4) 
	 * { 
	 * this.data3 = data3; 
	 * this.data4 = data4; }
	 */
	
	@Autowired
	public TestBean(@Value("100") int data1, @Value("spring100")String data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	
	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
}
