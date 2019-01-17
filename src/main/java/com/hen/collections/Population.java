package com.hen.collections;

import java.util.ArrayList;
import java.util.List;

public class Population {


        String city;
        List<Person> person;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public List<Person> getPerson() {
            return person;
        }

        public void setPerson(List<Person> person) {
            this.person = person;
        }

        @Override
        public String toString() {
            return "city=" + city + " [person=" + person + "]";
        }

        List<Population> populList = new ArrayList<>();
        List<Person> personList1 = null;

        public List<Population> populatePopulationList(List<Person> personList) {
            for (Person person : personList) {
                personList1 = new ArrayList<>();
                personList1.add(person);
                Population population = findPopulationByCity(person.getCity(), populList);

                if (population == null) {

                    population = new Population();
                    population.setCity(person.getCity());
                    population.setPerson(personList1);
                    populList.add(population);
                }

                else {
                    population.getPerson().add(person);
                }

            }

            return populList;
        }

        public Population findPopulationByCity(String cityName, List<Population> populationList) {

            for (Population pop : populationList) {

                if (pop.getCity().equals(cityName)) {
                    return pop;
                }
            }
            return null;
        }

    }
