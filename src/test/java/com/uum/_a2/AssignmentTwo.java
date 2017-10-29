//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;


public class AssignmentTwo {
   
    private String semester;
    private String course;
    private int matricNumber;
    private String group;
    private String task;
    String line;
    
    @Test
    public void GetReadInfo(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            if (line.contains("Semester")) {
                semester = line.substring(line.lastIndexOf("#") + 1);
            } else if (line.contains("Course")) {
                course = line.substring(line.lastIndexOf("#") + 1);
            } else if (line.contains("Matrik")) {
                matricNumber = Integer.parseInt(line.substring(line.lastIndexOf("#") + 1));
            } else if (line.contains("Group")) {
                group = line.substring(line.lastIndexOf("#") + 1);
            } else if (line.contains("Task")) {
                task = line.substring(line.lastIndexOf("#") + 1);
            }
        }
    }

}
