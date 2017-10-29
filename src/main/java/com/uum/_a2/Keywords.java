//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Keywords {
     
    public static final String directory = "C:\\Users\\ANUBIRIA\\Desktop\\Assignment2_TestFiles\\MyThread1.java";
  
  
 
    private final File newFile;
    private LinkedList<String> list;
    private int numberOfJavaKeywords;
    private Set<String> javaKeywordSet;
    private Scanner input;
        int[] keywordsCount;
        String[] Keywords = {"abstract", "assert", "boolean", "break", "byte", "case",
            "catch", "char", "class", "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float", "for", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while", "true", "null", "false", "const", "goto"};

        public Keywords (File newFile) {
        this.numberOfJavaKeywords = 0;
        this.newFile = newFile;
    }

    public LinkedList getKeywords() throws FileNotFoundException {
      //  javaKeywordSet = new HashSet<>(Arrays.asList(keywordString)); 
        input = new Scanner(newFile);
        list = new LinkedList<>();
        while (input.hasNext()) {
            String word = input.next();
            if (javaKeywordSet.contains(word)) {
                list.add(word);
                numberOfJavaKeywords++;
            }
        }
        return list;
    }

}
