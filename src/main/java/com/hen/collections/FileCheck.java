package com.hen.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCheck {

    public void fileValidator(File fileName) throws IOException {

        if (!fileName.canExecute()) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Cant read file: " + fileName + "\nCreate new File? yes/no");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                fileName.createNewFile();
                FileWriter fw;
                try {
                    fw = new FileWriter(fileName,true);


                        fw.append("first name,last name,gender,age,city");

                        fw.flush();
                        fw.close();
                    }

                 catch (IOException e) {

                    e.printStackTrace();
                }

            } else {
                throw new FileNotFoundException();
            }
        }
    }
}
