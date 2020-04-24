package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poipoi {
	

	public static Object getdata(String sheetname,  int rowname, int colnum)
	{
		Object data=null;
		try
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\arvip\\Desktop\\apacheexcelsheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		XSSFRow row=sheet.getRow(rowname);
		XSSFCell cell=row.getCell(colnum);
		CellType celltype=cell.getCellType();
		switch(celltype)
		{
			case STRING:
				 data=cell.getStringCellValue();
			     break;
			case NUMERIC:
			data=cell.getNumericCellValue();
			break;
			case BOOLEAN:
			data=cell.getBooleanCellValue();
			break;
			
				
		}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}

	
	}


	
	
		
	


