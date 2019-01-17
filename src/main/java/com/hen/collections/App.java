package com.hen.collections;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) {

        String fileName = "PeopleDatabase.csv";
        File file = new File(fileName);

        FileCheck fileCheck = new FileCheck();
        try {
            fileCheck.fileValidator(file);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        AddPerson addPerson = new AddPerson();
        List<Person> newPersonList = addPerson.isNewPerson();

        if(newPersonList.get(0)!=null) {
            AddPersonToFile personToFile = new AddPersonToFile();
            personToFile.addPersonToFile(newPersonList, file);
        }

        FileRead fileRead = new FileRead();
        List<Person> personList = fileRead.fileRead(fileName);

        Population population = new Population();
        List<Population> populList = population.populatePopulationList(personList);

        System.out.println(populList);
    }

}
