package in.raju;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao{
	public void init() throws Exception {
         System.out.println("InIt Method Before Obj Creation....");
		
	}
	public void getData() {
		System.out.println("Getting data from DB......");
	}
	public void destroy() throws Exception {
		System.out.println("Destroy Method After Obj Creation....");
	}
	

}
