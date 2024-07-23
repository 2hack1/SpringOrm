package in.sp.jdb.spring;

import org.springframework.stereotype.Component;

@Component
public class Jspring {
	private String nam;
	private String f;
	
	public String getNam() {
		return nam;
	}
	
	public void setNam(String nam) {
		this.nam = nam;
	}
	
	public String getF() {
		return f;
	}
	
	public void setF(String f) {
		this.f = f;
	}
	
	
	public void p() {
		System.out.println(nam);
		System.out.println(f);
	}

}
