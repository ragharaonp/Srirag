package corejava;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Raghavendra\\Desktop\\Testdata.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheetAt(0);
			int noOfRows = ws.getPhysicalNumberOfRows();
			ArrayList<String> rowArr;
			LinkedHashMap<Integer, ArrayList<String>> map = new LinkedHashMap<Integer, ArrayList<String>>();
			for (int i=0; i<noOfRows; i++) {
				Row rw = ws.getRow(i);
				rowArr = new ArrayList<String>();
				for (int j=0; j<rw.getLastCellNum(); j++) {
					Cell cell = rw.getCell(j);
					//System.out.println(cell.getStringCellValue());
					//rowArr.add(cell.getNumericCellValue());
					rowArr.add(cell.getStringCellValue());
				}
				map.put(i, rowArr);
			}
			System.out.println(map);
			System.out.println(map.get(0).get(0));
			wb.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
