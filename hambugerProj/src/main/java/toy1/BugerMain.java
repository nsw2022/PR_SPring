package toy1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BugerMain {

	public static void main(String[] args) {
		
		
		System.out.println("**********************************");
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("goToy1/xtoy1.xml");
		Buger xb = (Buger) context.getBean("b1");
		System.out.println(xb.bugerCalo);
		
		
		
		
	}

}
