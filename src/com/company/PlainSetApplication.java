package com.company;

import java.time.Period;
import java.util.*;

public class PlainSetApplication {

    public static void main(String[] args) {
        List lettersList = new ArrayList<>();
//        List<Object> lettersList = new ArrayList<>();

        Set<String> lettersSet = new HashSet<>();


        System.out.println(lettersSet.add("a"));
        System.out.println(lettersSet.add("b"));
        System.out.println(lettersSet.add("c"));

        System.out.println(lettersSet.add("a"));

        System.out.println(lettersSet);

        System.out.println("Removing z: " + lettersSet.remove("z") );

        System.out.println(lettersSet);
        System.out.println("Size: " + lettersSet.size());
        System.out.println("Is empty: " + lettersSet.isEmpty());

        System.out.println("Contains a: " + lettersSet.contains("a"));
        System.out.println("Contains z: " + lettersSet.contains("z"));
        lettersSet.clear();

        System.out.println(lettersSet);
        System.out.println("Is empty: " + lettersSet.isEmpty());


        System.out.println("------------");
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("cba"); //1 -> 2
        hashSet.add("ba"); //2 -> 3
        hashSet.add("a");  //3 -> 1

        System.out.println("HashSet after cba,ba,a: " + hashSet);

        treeSet.add("cba");
        treeSet.add("ba");
        treeSet.add("a");
        System.out.println("TreeSet after cba,ba,a: " + treeSet);

        linkedHashSet.add("cba");
        linkedHashSet.add("ba");
        linkedHashSet.add("a");
        System.out.println("LinkedHashSet after cba,ba,a: " + linkedHashSet);




    }
}



