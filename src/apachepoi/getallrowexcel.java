package apachepoi;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class getallrowexcel {
	@Test
	public void login()
	{
		System.out.println("prakash");
		ArrayList al=rowdata.getallrowdata1("sheet1", 1);
		System.out.println("ramana");
		ArrayList all=rowdata.getallcoldata1("sheet1", 2);
		for(Object data:all)		
		{
			System.out.println(data);
		}
	}

}
