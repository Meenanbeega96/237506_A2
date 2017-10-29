//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a2;

import static com.uum._a2.Keywords.directory;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class CountLineCodes {
   static String lineRead = null;
    static int lineNumberCount = 0;
    static int blankCount = 0;
    static int commentCount = 0;
    static int actual;

    public static int cloc() {
        try {
            FileReader fr = new FileReader(directory);
            LineNumberReader lr = new LineNumberReader(fr);

            while (lr.readLine() != null) {
                lineNumberCount++;
            }System.out.println("LOC = " + lineNumberCount);
        } catch (IOException e) {
        }
        return lineNumberCount;
        
    }

    public static int blank() {
        try {
            FileReader fr = new FileReader(directory);
            LineNumberReader lr = new LineNumberReader(fr);

            while ((lineRead = lr.readLine()) != null) {
                if (lineRead.trim().isEmpty()) {
                    blankCount++;
                }
            }System.out.println("Blank = " + blankCount);
        } catch (IOException e) {
        }
        return blankCount;
    }

    public static int comment() {
        try {
            FileReader fr = new FileReader(directory);
            LineNumberReader lr = new LineNumberReader(fr);

            while ((lineRead = lr.readLine()) != null) {
                if (lineRead.contains("//") || lineRead.contains("*") || lineRead.contains("/*") || lineRead.contains("*/")) {
                    commentCount++;
                }
            }System.out.println("Comment = " + commentCount);
        } catch (IOException e) {
        }
        return commentCount;
    }

    public static int actualLOC() {
        actual = (lineNumberCount - blankCount - commentCount);
        System.out.println("Actual LOC = " + actual);
        return actual;
    } 
}
