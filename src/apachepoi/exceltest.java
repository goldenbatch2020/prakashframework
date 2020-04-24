package apachepoi;

import org.testng.annotations.Test;

public class exceltest {
	@Test
	public void login()
	{
		Object val=poipoi.getdata("Sheet1", 1, 1);
		System.out.println(val);
		
		
		
	}

}
