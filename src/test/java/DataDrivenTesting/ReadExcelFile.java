package DataDrivenTesting;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Iterator;

public class ReadExcelFile {

    @Test
    public void readData() {

        String path = "C:\\Users\\dell\\IdeaProjects\\Selenium_TestingBaba\\src\\test\\TestData\\ExcelData.xlsx";

        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while(rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(cell.getCellType() == CellType.NUMERIC){
                        System.out.println(cell.getNumericCellValue());
                    }
                    if(cell.getCellType() == CellType.STRING){
                        System.out.println(cell.getStringCellValue());
                    }
                    System.out.println(cell.getStringCellValue());
                }
            }
        }
        catch (Exception e) {
            System.out.println("Issues in this code : " + e);
        }
    }
}
