package apachepoi;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class rowdata {
	public static ArrayList getallrowdata1(String sheetname, int rownum)
	{
		ArrayList al=new ArrayList();
		try
		{
			FileInputStream fis= new FileInputStream("C:\\Users\\arvip\\Desktop\\apacheexcelsheet.xlsx");
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetname);
			XSSFRow row=sheet.getRow(rownum);
			Iterator<Cell> itr=row.cellIterator();
			while(itr.hasNext())
			{
				Cell cell=itr.next();
				CellType celltype=cell.getCellType();
				switch(celltype)
				{
				case STRING:
					String data=cell.getStringCellValue();
					al.add(data);
					break;
				case NUMERIC:
					Number num=cell.getNumericCellValue();
					al.add(num);
					break;
				case BOOLEAN:
					Boolean b1=cell.getBooleanCellValue();
					al.add(b1);
					break;
				}
				
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
		
	}
	public static ArrayList getallcoldata1(String sheetname, int colnum)
	{
		ArrayList al=new ArrayList();
		try
		{
			FileInputStream fis= new FileInputStream("C:\\Users\\arvip\\Desktop\\apacheexcelsheet.xlsx");
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetname);
			;
			Iterator<Row> itr=sheet.rowIterator();
			while(itr.hasNext())
			{
				Row row=itr.next();
				Cell cell=row.getCell(colnum);
				CellType celltype=cell.getCellType();
				switch(celltype)
				{
				case STRING:
					String data=cell.getStringCellValue();
					al.add(data);
					break;
				case NUMERIC:
					Number num=cell.getNumericCellValue();
					al.add(num);
					break;
				case BOOLEAN:
					Boolean b1=cell.getBooleanCellValue();
					al.add(b1);
					break;
				}
				
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
		
	}

	

}
