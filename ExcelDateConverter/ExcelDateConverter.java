package com.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class ExcelDateConverter {
    // Excel date base (1st January 1900)
    private static final int EXCEL_DATE_BASE = 1900;
    private static final int EXCEL_DATE_BASE_MONTH = 1;
    private static final int EXCEL_DATE_BASE_DAY = 1;

    public static Date convertStringToDate(String dateString) {
        final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy"); // Wed Jun 05
                                                                                                          // 01:00:00
                                                                                                          // CEST 2024
        final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyyMMdd"); // 20240711
        final DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // 01/11/2023
        final DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 2022-07-27
        final DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // 04-0-2013

        DateTimeFormatter[] formatters = { formatter1, formatter2, formatter3, formatter4, formatter5 };

        // Intentar convertir directamente como un número de fecha de Excel
        try {
            double excelDate = Double.parseDouble(dateString);
            // Excel considers 1900 as a leap year, which is not correct, so we need to
            // adjust for this
            // by subtracting 1 day for dates after Feb 28, 1900.
            boolean isLeapYearBug = excelDate >= 60; // Bug in Excel where 1900 is incorrectly treated as a leap year

            Calendar calendar = Calendar.getInstance();
            calendar.set(EXCEL_DATE_BASE, EXCEL_DATE_BASE_MONTH - 1, EXCEL_DATE_BASE_DAY);
            long millis = calendar.getTimeInMillis();

            // Convert days to milliseconds
            long daysToMillis = (long) ((excelDate - 2) * 86400000L); // 86400000L is the number of milliseconds in a
                                                                      // day
            millis += daysToMillis;

            // Handle leap year bug
            if (isLeapYearBug) {
                millis -= 86400000L; // Subtract one day to correct for the leap year bug
            }

            return new Date(millis);
        } catch (NumberFormatException e) {
            // No hacer nada, continuar con los otros formatos
        }

        // Intentar convertir usando los formatos de fecha especificados
        for (DateTimeFormatter formatter : formatters) {
            try {
                if (formatter.equals(formatter1)) {
                    ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateString, formatter);
                    return Date.from(zonedDateTime.toInstant());
                } else {
                    LocalDate localDate = LocalDate.parse(dateString, formatter);
                    return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                }
            } catch (DateTimeParseException e) {
                // Continuar al siguiente patrón
            }
        }

        throw new IllegalArgumentException("Date format not supported: " + dateString);
    }

    private static void processDateString(String dateString) {
        try {
            Date date = convertStringToDate(dateString);
            System.out.println("Converted Date: " + date);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readExcelAndConvertDates(String filePath) {
        try (FileInputStream file = new FileInputStream(filePath)) {
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<?> rows = sheet.rowIterator();

            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator<?> cells = row.cellIterator();
                ArrayList<String> rowData = new ArrayList<>();

                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                        default:
                            rowData.add("");
                    }
                }

                // Asumimos que la fecha está en una columna específica, por ejemplo, la columna
                // 3
                if (rowData.size() > 4) {
                    String dateString = rowData.get(2);
                    processDateString(dateString);
                }
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Ruta al archivo Excel
        String filePath = "demo/test.xls";
        readExcelAndConvertDates(filePath);
    }
}
