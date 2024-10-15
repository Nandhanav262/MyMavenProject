package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelRead {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String get_string_data(int a,int b) throws IOException
	{
		f= new FileInputStream("C:\\Users\\suhai\\OneDrive\\Desktop\\sumayya\\ExcelRead.xlsx");
		w= new XSSFWorkbook (f);
		sh=w.getSheet("Sheet1");
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
		}
	
	public static void get_integer_data()
	{
		
	}

	

}
