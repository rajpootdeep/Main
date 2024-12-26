package org.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] ar) throws IOException {
//        String[] arr={"Deep", "Kumar","Ram","Shyam","ram","Deep"};
//        Stream<String> s= Arrays.stream(arr);
//        List<Integer> list= List.of(1,5,3,8,8);
//        List<String> list1=Arrays.asList(arr);
//        list1.stream().filter(a -> a.equalsIgnoreCase("ram")).distinct();
//        ;
//        System.out.println(Arrays.toString(Stream.of(1, 76, 3, 7).toArray()));


//        Files.lines(Paths.get("D:\\intellij\\Deflt\\Main\\Main\\src\\main\\java\\org\\streams\\test.txt")).forEach(line -> System.out.println(Arrays.toString(line.split("\\|"))));

//        Stream.of(18,8,5,93).max((a,b) -> a-b).ifPresent(System.out::println);
//        System.out.println(Stream.of(8,5,0).filter(a -> a!=0).reduce(1,(a,b) -> a*b));

//        System.out.println(Stream.empty().reduce(1,(a,b) -> b * a));


//        System.out.println(Stream.of( 1,4,78,3,67).collect(Collectors.toMap(a -> a,a -> a*a)));
//            Stream.of(1,2,3,4,2,3,1).peek(System.out::println).limit(2).forEach(System.out::println);
        System.out.println(Stream.of("Deep","Ram").collect(Collectors.joining(",")));
        String s=Stream.of("Deep","Ram").collect(Collectors.joining(","));
    }
}
