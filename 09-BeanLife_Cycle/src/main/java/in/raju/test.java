package in.raju;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	UserDao bean = ctx.getBean(UserDao.class);
	bean.getData();
	//ConfigurableApplicationContext cctxt=(ConfigurableApplicationContext)cctxt;
	
}
}
