package com.hen.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddPerson {
    Scanner scanner = new Scanner(System.in);

    public List<Person> isNewPerson() {

        boolean bol = true;
        Person person = new Person();
        ArrayList<Person> personList = new ArrayList<>();

        while (bol) {

            System.out.println("Add new person? Yes/No");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("Yes")) {

                personList.add(personFromInput());

            } else {
                bol = false;
                         }

        }
        return personList;
    }

    public Person personFromInput() {

        PersonValidator personValidator = new PersonValidator();
        Person person = new Person();
        try {
            System.out.println("Enter name: (type exit to exit)");
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit")) {

                return null;

            }

            person.setName(str);
            personValidator.validate(person.getName());

            System.out.println("Enter last name: (type exit to exit)");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) {

                return null;
            }
            person.setLname(str);
            personValidator.validate(person.getLname());

            System.out.println("Enter gender: (type exit to exit)");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) {

                return null;
            }
            person.setGender(str);
            personValidator.validateGen(person.getGender());

            System.out.println("Enter city: (type exit to exit)");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) {

                return null;
            }

            person.setCity(str);

            System.out.println("Enter age: (type exit to exit)");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                return null;
            }

            person.setAge(Integer.parseInt(str));
            personValidator.validateAge(person.getAge());

            return person;

        } catch (IllegalArgumentException e) {
            System.out.println(e);

            return null;
        }

    }

}