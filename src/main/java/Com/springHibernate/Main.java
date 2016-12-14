package Com.springHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext();
		Dao dao=(Dao)applicationContext.getBean("dao");
		dao.insert(new Registration("ganga","1144"));
		System.out.println("done");
	}

}
