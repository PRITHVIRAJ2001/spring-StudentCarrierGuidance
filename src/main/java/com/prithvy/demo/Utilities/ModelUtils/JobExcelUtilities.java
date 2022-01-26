package com.prithvy.demo.Utilities.ModelUtils;

import com.prithvy.demo.Utilities.GeneralModel.Jobs;
import lombok.Data;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
@Component
public class JobExcelUtilities {

    private static final String EXCELTYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    public static ByteArrayInputStream jobsToExcel(List<Jobs> jobs) throws IOException {
        String[] COLUMNs = {"Id", "courseId", "job"};
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
            CreationHelper createHelper = workbook.getCreationHelper();

            Sheet sheet = workbook.createSheet("Jobs");

            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setColor(IndexedColors.BLUE.getIndex());

            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Row for Header
            Row headerRow = sheet.createRow(0);

            // Header
            for (int col = 0; col < COLUMNs.length; col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(COLUMNs[col]);
                cell.setCellStyle(headerCellStyle);
            }

            int rowIdx = 1;
            for (Jobs job : jobs) {
                Row row = sheet.createRow(rowIdx++);

                row.createCell(0).setCellValue(job.getId());
                row.createCell(1).setCellValue(job.getCourseId());
                row.createCell(2).setCellValue(job.getJob());
            }

            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        }
    }

    public static List<Jobs> parseExcelFile(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet("Courses");
            Iterator<Row> rows = sheet.iterator();

            List<Jobs> lstCustomers = new ArrayList<>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                Jobs cust = new Jobs();

                int cellIndex = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    if (cellIndex == 0) { // ID
                        cust.setId((long) currentCell.getNumericCellValue());
                    } else if (cellIndex == 1) { // Name
                        cust.setCourseId((long) currentCell.getNumericCellValue());
                    } else if (cellIndex == 2) { // Address
                        cust.setJob(currentCell.getStringCellValue());
                    }

                    cellIndex++;
                }

                lstCustomers.add(cust);
            }

            // Close WorkBook
            workbook.close();

            return lstCustomers;
        } catch (IOException e) {
            throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }
    }

    public static boolean isExcelFile(MultipartFile file) {

        if (!EXCELTYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }
}
