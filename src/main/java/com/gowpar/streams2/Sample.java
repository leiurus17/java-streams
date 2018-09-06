package main.java.com.gowpar.streams2;

import java.util.List;

public class Sample {

    public static List<Person> createPeople() {
        new Person("Sara", Gender.FEMALE, 20);
        new Person("Sara", Gender.FEMALE, 22);
        new Person("Bob", Gender.MALE, 20);
        new Person("Paula", Gender.FEMALE, 32);
        new Person("Paul", Gender.MALE, 32);
        new Person("Jack", Gender.MALE, 2);
        new Person("Jack", Gender.MALE, 72);
        new Person("Jill", Gender.FEMALE, 12);
    }

    public static void main(String[] args) {
        List<Person> people = createPeople();
    }
}
