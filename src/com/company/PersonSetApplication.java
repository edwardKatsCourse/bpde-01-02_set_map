package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class PersonSetApplication {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        Person person_1 = new Person(50, "Anna");
        Person person_2 = new Person(30, "Daniel");
        personSet.add(person_1);
        personSet.add(person_2);
        System.out.println("Person HashSet: " + personSet);

        Set<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(person_1);
        personTreeSet.add(person_2);
        personTreeSet.add(new Person(31, "Ivan"));
        personTreeSet.add(new Person(18, "David"));
        personTreeSet.add(new Person(46, "Sarah"));
        personTreeSet.add(new Person(22, "Marry"));
        personTreeSet.add(new Person(79, "Jane"));
        personTreeSet.add(new Person(2, "Clara"));
        personTreeSet.add(new Person(100, "Bob"));

        System.out.println("Person TreeSet:");
        for (Person p : personTreeSet) {
            System.out.println(p.toString());
        }
    }
}

class Person implements Comparable<Person> {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person o) {
//        return this.age.compareTo(o.getAge());
        return this.name.compareTo(o.getName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }
    //        return Objects.hash(name);
    //
    //    public int hashCode() {
    //    @Override
    //
    //    }
    //        return Objects.equals(name, person.name);
    //        Person person = (Person) o;
    //        if (o == null || getClass() != o.getClass()) return false;
    //        if (this == o) return true;
    //    public boolean equals(Object o) {
    //    @Override

//    }
    //        return Objects.hash(age, name);
    //    public int hashCode() {
    //    @Override
    //    //city region
    //
    //    }
    //                Objects.equals(name, person.name);
    //        return Objects.equals(age, person.age) &&
    //        Person person = (Person) o;
    //        if (o == null || getClass() != o.getClass()) return false;
    //        if (this == o) return true;
    //    public boolean equals(Object o) {
    //    @Override
    //street

//    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}