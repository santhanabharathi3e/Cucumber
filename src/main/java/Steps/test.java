package Steps;

import java.io.File;
import java.io.FileInputStream;
// import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class test {

	public static void main(String[] args) {
		
		
		try{
			File file = new File("C:\\Users\\SB\\Desktop\\Book1.xlsx");
			
			FileInputStream fStream = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(fStream);
			
			Sheet sh = wb.getSheet("Sheet1");
			
			System.out.println(sh.getLastRowNum());
			
			
			for(int i = 0 ; i<= sh.getLastRowNum() ; i++)
				
			{
				Row row = sh.getRow(i);
				
				
				for(int j = 0 ; j< row.getPhysicalNumberOfCells() ; j++) {
					
					Cell cell = row.getCell(j);
					
					int cellType = cell.getCellType();
					
					if(cellType == 0 )
					{
						int h = (int) cell.getNumericCellValue();
						System.out.print(h);
						
					}
					else if(cellType == 1)
					{
						System.out.print(cell.getStringCellValue());
					}
					
					System.out.print(" ");					
				}
				
				System.out.println();				
			}		
		}
		
		catch(Exception e)
		{
			
		}
	}
}
