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
import org.junit.Test;


public class Keywords {
    
    
    public static final String directory = "C:\\Users\\ANUBIRIA\\Desktop\\Assignment2_TestFiles\\MyThread1.java";
    
   
    private LinkedList<String> list;
    private int numberOfJavaKeywords;
    private Set<String> javaKeywordSet;
    private Scanner input;
    
    @Test
     public LinkedList getKeywords() throws FileNotFoundException {
       Readable newFile = null;
      //javaKeywordSet = new HashSet<>(Arrays.asList(keywordString)); 
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
