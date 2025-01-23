package org.example;

import java.util.Arrays;
import java.util.List;

public class AntinoLabs {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        names.stream().filter(name -> {
            System.out.println("Filtering: " + name);
            return name.startsWith("J");
        }).map(name -> {
            System.out.println("Mapping: " + name);
            return name.toUpperCase();
        }).limit(2).forEach(System.out::println);
    }
}

/*
* Filtering: John
* Filtering: Jane
* Filtering: Jack
* Filtering: Doe
* Mapping : John
* Mapping : Jane
* Mapping : Jack
* JOHN
* JANE
* */