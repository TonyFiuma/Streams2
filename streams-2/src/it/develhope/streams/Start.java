package it.develhope.streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start{
    public static void main(String[] args) throws IOException{

        File file = new File("C:\\Users\\axelf\\OneDrive\\Desktop\\EserciziJava\\javaAvanzato2Modulo"+
                                     "\\Streams(2)\\streams-2\\src\\file.txt");

        System.out.println(file.exists() ? "The file Already exist and you are overwriting it"
                                   : "You have created new file.txt");

        FileWriter fw = new FileWriter("C:\\Users\\axelf\\OneDrive\\Desktop\\EserciziJava"+
                                               "\\javaAvanzato2Modulo\\Streams(2)\\streams-2\\src\\file.txt");

        LocalDateTime     localDateTime     = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("Y-MM-d--H-mm-s");
        fw.write(dateTimeFormatter.format(localDateTime));
        fw.close();
    }
}








