package com.abi.test.pageobject.Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	private static Workbook workbook;
    private static Sheet sheet;

    public static Object[][] getTestData(String filePath, String sheetName) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(inputStream);
        sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i + 1); // Skip header row
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                switch (cell.getCellType()) {
                    case STRING:
                        data[i][j] = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        data[i][j] = cell.getNumericCellValue();
                        break;
                    case BOOLEAN:
                        data[i][j] = cell.getBooleanCellValue();
                        break;
                    default:
                        data[i][j] = null;
                }
            }
        }
        return data;
    }

    public static void closeWorkbook() throws IOException {
        if (workbook != null)
            workbook.close();
    }
}
