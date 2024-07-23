package in.sp.jdb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] arg ) {
		String con="/in/sp/jdb/spring/cofig.xml";
		ApplicationContext context =new ClassPathXmlApplicationContext(con);
		
	Jspring kk=(Jspring)context.getBean("add");
	System.out.println(kk);
	kk.p();
//	String g="insert  into tap(name ,email.city) values(?,?,?)";
//	
////	int result= kk.update(g,"kafdas","dnfgnl");
//	int result =kk.update(g,"kspi","kapil");
//		
	}
}
