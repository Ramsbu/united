package com.united.automation.selenium;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataDrivenCSV {

    public static ArrayList<String> getData(String testcaseName) throws IOException {
        ArrayList data = new ArrayList();
        CSVReader reader = new CSVReader(new FileReader("/Users/charan/Documents/Java_projects/united/src/main/resources/TestData.csv"));
        List<String[]> li = reader.readAll();
        System.out.println("Total rows which we have is " + li.size());
        Iterator<String[]> i1 = li.iterator();

        while (i1.hasNext()) {
            String[] str = i1.next();

            System.out.print(" Values are ");

            for (int i = 0; i < str.length; i++) {
                System.out.print(" " + str[i]);
                data.add(str[i]);
            }
        }
        return data;
    }
}
