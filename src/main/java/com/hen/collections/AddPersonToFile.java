package com.hen.collections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AddPersonToFile {
    public void addPersonToFile(List<Person> personList, File file) {

        FileWriter fw;
        try {
            fw = new FileWriter(file,true);

            for(Person person: personList) {
                fw.append("\n");
                fw.append(person.getName());
                fw.append(",");
                fw.append(person.getLname());
                fw.append(",");
                fw.append(person.getGender());
                fw.append(",");
                fw.append(String.valueOf(person.getAge()));
                fw.append(",");
                fw.append(person.getCity());

                fw.flush();

            }
            fw.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
