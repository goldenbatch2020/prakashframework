package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class bhagyamma {
	public static void setdata(String sheetname, int rownum, int colnum, String data)
	{
	try
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\arvip\\Desktop\\apacheexcelsheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		XSSFRow row=sheet.getRow(rownum);
		XSSFCell cell=row.createCell(colnum);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(data);
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\arvip\\Desktop\\apacheexcelsheet.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("success");
		System.out.println("done");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
