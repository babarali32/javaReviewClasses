import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelFilereading {



    public static void main(String[] args) throws IOException {
        String path="Files/excelFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet("mysheet1");
        XSSFRow row=sheet.getRow(1);
        XSSFCell cel=row.getCell(2);
        System.out.println(cel);









    }
}
