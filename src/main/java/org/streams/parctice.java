package org.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class parctice {
    public static void main(String[] args) {
        List<List<String>> skills = Arrays.asList(Arrays.asList("Java", "spring"), Arrays.asList("SMySQL", "DB"));

        List<String> list=skills.stream().flatMap(Collection::stream).filter(c -> c.charAt(0)=='s' ).toList();
        System.out.println(list);
       List<Stream<String>> ss=skills.stream().map(b -> b.stream()).toList();
        System.out.println();

    }
}
