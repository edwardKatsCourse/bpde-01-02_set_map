package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PersonMapApplication {

    public static void main(String[] args) {
//        MyMap<String, Integer> myMap = new MyMap<>();
//        myMap.getKey();
        Map<String, Person> map = new HashMap<>();
        Person daniel = new Person(21, "Daniel");
        map.put("daniel@site.com", daniel);


        System.out.println("map.size: " + map.size());
        System.out.println("map.isEmpty: " + map.isEmpty());

        System.out.println("map.containsKey: " + map.containsKey("daniel@site.com"));
        System.out.println("map.containsValue: " + map.containsValue(daniel));

        Person personDaniel = map.get("daniel@site.com");
        Person personNotDaniel = map.get("anna@site.com");

        System.out.println("Person Daniel: " + personDaniel);
        System.out.println("Person not Daniel: " + personNotDaniel);

        System.out.println("map.keySet(): " + map.keySet());
        Person jane = map.replace("daniel@site.com", new Person(55, "Jane"));
        Person abc = map.replace("abc@site.com", new Person(55, "ABC"));

        System.out.println("Jane after replace: " + jane);
        System.out.println("ABC after replace: " + abc);

        System.out.println(map);

        System.out.println("Map iteration: ");
        for (Map.Entry<String, Person> iterMap : map.entrySet()) {
            System.out.print("Key: " + iterMap.getKey() + "  --  ");
            System.out.print("Value: " + iterMap.getValue());
        }

        new HashMap<>();
        new TreeMap<>();
        new LinkedHashMap<>();
    }
}

//class MyMap <K, VALUE> {
//
//    private K key;
//    private VALUE value;
//
//    public MyMap(String key, Integer value) {
//    }
//
//
//
//    K getKey() {
//        return null;
//    }
//}
