package Sorulacaklar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task31 {
    public static void main(String[] args) throws Exception
    {


        String command = "java --version";

        Process proc = Runtime.getRuntime().exec(command);

        // Read the output

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null) {
            if (line.toLowerCase().contains("java")){
                System.out.println("Java is installed");
                break;
            }
        }

        proc.waitFor();

    }

}
/*
31. Write a Java program to check whether Java is installed on your computer. Go to the editor
Expected Output

Java Version: 1.8.0_71
Java Runtime Version: 1.8.0_71-b15
Java Home: /opt/jdk/jdk1.8.0_71/jre
Java Vendor: Oracle Corporation
Java Vendor URL: http://Java.oracle.com/
Java Class Path: .
 */