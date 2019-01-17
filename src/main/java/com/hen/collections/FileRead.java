package com.hen.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public List<Person> fileRead(String fileName) {
        String values;
        List<Person> personList;
        personList = new ArrayList<>();
        int counter = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            reader.readLine();

            Person person;
            while ((values = reader.readLine()) != null) {
                counter++;

                try {
                    String line[] = values.split(",");

                    person = new Person();
                    person.setName(line[0]);
                    person.setLname(line[1]);
                    person.setGender(line[2]);
                    person.setAge(Integer.parseInt(line[3]));
                    person.setCity(line[4]);
                    personList.add(person);
                } catch (NumberFormatException  | ArrayIndexOutOfBoundsException e ) {

                    System.out.println("invalid data at line no: " + counter + ", in file: " + fileName);
                }

            }
            } catch(IOException e){
                System.out.println("Problem reading the file" + fileName);
            }


            return personList;
        }

    }
