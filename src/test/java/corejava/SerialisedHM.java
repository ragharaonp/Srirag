package corejava;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SerialisedHM {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Raghavendra\\Desktop\\Testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		for(int i=0; i<sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			DataFormatter formatter = new DataFormatter();
			Map<String, String> rowLevelMap = new HashMap<>();
			HashMap<Integer, Map<String, String>> serialisedHashMap = new HashMap<>();
			ArrayList<String> rowValues = new ArrayList<String>();
			ArrayList<String> currentRow = new ArrayList<String>();
			if(i==0) {
				for (int j = 0; j < row.getLastCellNum(); j++) {
					rowValues.add(formatter.formatCellValue(row.getCell(j)));
				}
			}
			else {
				for (int j = 0; j < row.getLastCellNum(); j++) {
					currentRow.add(formatter.formatCellValue(row.getCell(j)));
				}
				for(int k = 0; k < currentRow.size(); k++) {
					String[] split = rowValues.get(k).split(":");
				if (split.length > 1)
					rowLevelMap.put(rowValues.get(k), currentRow.get(k));
				}
				for(int consolidator=0; consolidator<=40; consolidator++) {
					String compare = consolidator + ":";
					Map<String, String> result = rowLevelMap.entrySet().stream().filter(map -> map.getKey().startsWith(compare)).collect(
						Collectors.toMap(map -> map.getKey().split(":")[1], Map.Entry::getValue)
						);
				if(result.size()>0)
					serialisedHashMap.put(consolidator, result);
				}
				serialisedHashMap.forEach((key, value) -> {
					System.out.println("SMKey: " + key);
				System.out.println("SMValue: " + value);
				});
				// Add putter for the hashmap here
			}
		}
		wb.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
