package com.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Cirteria male = new CriteriaMale();
        Cirteria female = new CriteriaFemale();
        Cirteria single = new CriteriaSingle();
        Cirteria singleMale = new AndCriteria(single, male);
        Cirteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males:");
        printPersons(male.meetCirteria(persons));

        System.out.println("females:");
        printPersons(female.meetCirteria(persons));

        System.out.println("single males:");
        printPersons(singleMale.meetCirteria(persons));

        System.out.println("single or females:");
        printPersons(singleOrFemale.meetCirteria(persons));
    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons
                ) {
            System.out.println("Name:" + person.getName() +
                    ",Gender:" + person.getGender() +
                    ",Marital:" + person.getMaritalStatu());
        }
    }
}
