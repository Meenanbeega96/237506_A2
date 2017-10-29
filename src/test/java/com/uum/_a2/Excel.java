//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a2;

import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.junit.Test;


public class Excel {
    
    
    @Test
     public void exportResultInExcel(String courseInfo[], int loc[], String[] keywords, int[] keyCount) {

        String courseInfoTitle[] = {"Semester", "Course", "Group", "Task"};
        Object field;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Results");
        int rowNum = 0;
        System.out.println("Creating & updating excel");

        for (int i = 0; i < (courseInfo.length - 1); i++) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            Cell cell = row.createCell(colNum++);
            field = courseInfoTitle[i];
            if (field instanceof String) {
                cell.setCellValue((String) courseInfoTitle[i]);
            }
            cell = row.createCell(colNum++);
            field = courseInfo[i];
            if (field instanceof String) {
                cell.setCellValue((String) courseInfo[i]);
            }
        }

        Row row = sheet.createRow(rowNum++);
        row = sheet.createRow(rowNum++);
        Cell cellTitle = row.createCell(5);
        cellTitle.setCellValue("Java Keywords");
        row = sheet.createRow(rowNum++);
        int colNum = 0;

        Cell cell = row.createCell(colNum++);
        field = "Matrik";
        if (field instanceof String) {
            cell.setCellValue("Matrik");
        }
        cell = row.createCell(colNum++);
        field = "LOC";
        if (field instanceof String) {
            cell.setCellValue("LOC");
        }
        cell = row.createCell(colNum++);
        field = "Blank";
        if (field instanceof String) {
            cell.setCellValue("Blank");
        }
        cell = row.createCell(colNum++);
        field = "Comment";
        if (field instanceof String) {
            cell.setCellValue("Comment");
        }
        cell = row.createCell(colNum++);
        field = "ActualLOC";
        if (field instanceof String) {
            cell.setCellValue("ActualLOC");
        }

        for (int i = 0; i < keyCount.length; i++) {
            if (keyCount[i] > 0) {
                cell = row.createCell(colNum++);
                field = keywords[i];
                if (field instanceof String) {
                    cell.setCellValue((String) keywords[i]);
                }
            }
        }

        cell = row.createCell(colNum++);
        field = "Total";
        if (field instanceof String) {
            cell.setCellValue("Total");
        }

        // new line
        row = sheet.createRow(rowNum++);
        int colNum2 = 0;

        cell = row.createCell(colNum2++);
        field = courseInfo[4];
        if (field instanceof String) {
            cell.setCellValue(courseInfo[4]);
        }

        for (int i = 0; i < loc.length; i++) {
            cell = row.createCell(colNum2++);
            field = loc[i];
            if (field instanceof Integer) {
                cell.setCellValue(loc[i]);
            }
        }

        for (int i = 0; i < keyCount.length; i++) {
            if (keyCount[i] > 0) {
                cell = row.createCell(colNum2++);
                field = keyCount[i];
                if (field instanceof Integer) {
                    cell.setCellValue((Integer) keyCount[i]);
                }
            }
        }

}
}