package Selinium;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

//public class Excell {
/*	
	public static void main(String[] args)  
		
	private static final String NUMERIC = null;
	private static final String STRING = null;
	// File file = new File("C:\\New folder\\ExcellDriven.xlsx");
	 FileInputStream file = new FileInputStream(new File("C:\\New folder\\ExcellDriven.xlsx"));
     Workbook sampleWorkbook=null;
     XSSFWorkbook workbook= new XSSFWorkbook(file);
     XSSFSheet sheet = workbook.getSheetAt(0);
     Iterator rowiterator =(Iterator) sheet.iterator()
     while(rowiterator.hasnext())
     {
    	 Row row =rowIterator.next();
    	 Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
    	 while(cellIterator.hasNext())
    	 {
    		 Cell cell =cellItearator.next();
    		 switch(cell.getCellType())
    		 {
    		 case NUMERIC:
    			 System.out.println(cell.getNumericCellValue());
    			 break;
    		 case STRING:
    			 System.out.println(cell.getStringCellValue());
    			 break;
    			 
    		 }
    	 }
    	 System.out.println("");
    	 
    	 
     
     file.close();     
}
catch(Exception e)
{
	e.printStackTrace();
}
}

*/