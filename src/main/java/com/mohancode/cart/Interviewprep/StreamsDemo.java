package com.mohancode.cart.Interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Person> persons = getPersons();

        Person max_AgePerson = null;
        int tmp = Integer.MIN_VALUE;
        for (Person p : persons) {
            if (p.age > tmp) {
                tmp = p.age;
                max_AgePerson = p;
            }
        }

        // System.out.println(max_AgePerson);
        max_AgePerson.display();

        //Filter
        List<Person> filterpersons = persons.stream().filter(person -> person.gender.equals("M")).toList();
        filterpersons.forEach(Person::display);

        //SORTED
        List<Person> sortPersoms = persons.stream().sorted().collect(Collectors.toList());
        sortPersoms.forEach(Person::display);

        
        

    }

    static List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("AA", 22, "M"));
        persons.add(new Person("BB", 43, "M"));
        persons.add(new Person("CC", 25, "F"));
        persons.add(new Person("DD", 27, "M"));
        persons.add(new Person("EE", 36, "F"));


        return new ArrayList<Person>(persons);
    }
}

class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println(" Name " + this.name + " Age " + this.age + " Gender " + this.gender);

    }
}