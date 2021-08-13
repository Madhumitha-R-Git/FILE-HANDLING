package com.company;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Appendingfile {
    public static void main(String[] args) {
        File f = new File("demo1.txt");
        try {
            boolean check  = f.createNewFile();
                System.out.println(check);

                FileWriter filewriter = new FileWriter("demo1.txt");
                filewriter.write("Welcome!");
                BufferedWriter b = new BufferedWriter(filewriter);
                b.write("ALL");
                b.close();




        }
        catch(IOException e)
        {
            System.out.println(e);
        }


    }
}
