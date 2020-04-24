package apachepoi;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class prakash {
	public static Object[] getAllRowdata(String sheetname, int rownum)
	{
		Object[] o1=null;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\arvip\\Desktop\\apacheexcelsheet.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetname);
			XSSFRow row=sheet.getRow(rownum);
			int cellnum=row.getLastCellNum();
			o1=new Object[cellnum];
			for(int i=0; i<cellnum; i++)
			{
				XSSFCell cell=row.getCell(i);
				CellType celltype=cell.getCellType();
				switch(celltype)
				{
				case STRING:
					o1[i]=cell.getStringCellValue();
					break;
				case NUMERIC:
					o1[i]=cell.getNumericCellValue();
					break;
				case BOOLEAN:
					o1[i]=cell.getBooleanCellValue();
					break;
				}
			}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return o1;
		}

}
