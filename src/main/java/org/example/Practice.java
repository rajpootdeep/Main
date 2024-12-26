package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {

        //Separate odd even
        /*Integer[] ar={1,4,7,4,8,5,63,23,5,9,10};
       List<Integer> list= Arrays.asList(ar);
        Map<Boolean, List<Integer>> oddEven = Arrays.stream(ar).collect(Collectors.partitioningBy(a -> a %2==0));
        System.out.println(oddEven);
//        Set<Map.Entry<Boolean,List<Integer>>> entrySet=oddEven.entrySet();
        for(Map.Entry<Boolean,List<Integer>> entry : oddEven.entrySet()){
            System.out.println(entry.getKey()+"    :     "+entry.getValue());}*/

        //Remove duplicate elements
        /*List<Integer> list=Arrays.asList(1,2,3,4,3,8,6,3,2,1);
//        List<Integer> list2=list.stream().distinct().toList();
        Set<Integer> list2= new HashSet<>(list);
        System.out.println(list2);*/

        //frequency of each character in String
        /*String name="Deep N";
//        System.out.println(Arrays.toString(name.chars().mapToObj(a -> (char)a).toArray()));
//
//        Stream<Character> streams = name.chars().mapToObj(a -> (char) a);

        Map<Character,Long> mp=name.chars().mapToObj(a -> (char) a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);*/

        //frequency of itmes in aaray
        /*Integer[] ar={1,4,76,4,3,2,456,6,3,3,4,3};
        Map<Integer,Long> mp=  Arrays.stream(ar).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));*/


        //Sort List in reverse order
       /* Integer[] ar={1,4,76,4,3,2,456,6,3,3,4,3};
        List<Integer> list=Arrays.asList(ar);
//        list=list.stream().sorted((a,b) -> a-b).toList();
        list=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);*/

        //Joint List of String
        /*List<String> list=Arrays.asList("Deep","Kumar","Weds","Life");
//        String s= String.join(" ",list);
        String s=list.stream().collect(Collectors.joining("+","prefix","suff"));
        System.out.println(s);*/

        //Min and max from list
   /* List<Integer> list=Arrays.asList(1,5,3,8,4,99,4,4,87);
    Optional<Integer> a=list.stream().max(Comparator.naturalOrder());
        System.out.println(a.get());*/

//merge two unsorted arrays into single sorted arrays
        /*int[] ar = {2, 78, 3, 9, 9, 4};
        int[] br = {9, 4, 9, 54, 32, 932};
        int[] a = IntStream.concat(Arrays.stream(ar), Arrays.stream(br)).sorted().toArray();
        System.out.println(Arrays.toString(a));*/


        //Anagrams?
       /* String s1="Deep";
        String s2="Pede";
        s1=Stream.of(s1.split("")).map(a -> a.toUpperCase()).sorted().collect(Collectors.joining());
        s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1.equals(s2));*/

        /*int[] arr={1,5,87,4,2,7};
        int[] arr2={2,4,53,46,43,0};

        int[] ss=Arrays.stream(arr).sorted().distinct().toArray();*/

        //sum of no
        /*int n = 830;
        int a = Stream.of(String.valueOf(n).split("")).map(x -> Integer.parseInt(x)).reduce(0, (i, b) -> i + b);
        System.out.println(a);*/

        //sort list of string in increasing order of their length

//        String[] s={"gzzgfg","ram,","shyam","o god"};
//        System.out.println(Arrays.stream(s).anyMatch(a -> a.equalsIgnoreCase("ram,")));
/*Object[] aa=Arrays.asList(s).stream().sorted(Comparator.comparing(a -> a.length())).toArray();
        System.out.println(Arrays.toString(aa));*/

        //reverse each word of string

       /* String s="Ram aam khata hai";
        String ss=Arrays.stream(s.split(" ")).map(a-> new StringBuilder(a).reverse()).collect(Collectors.joining(" "));
        System.out.println(ss);*/

        //find string which start with no

        /*String[] strings={"ram","shyam","8Kishan","Bhagwan"};
        List.of(strings).stream().filter( a-> Character.isDigit(a.charAt(0))).forEach(System.out::println);*/


        //palindrome program in java

//        String s="SSS";
//        s.chars().noneMatch()

        //duplicates elements from array

        /*Integer[] arr = {1, 6, 3, 7, 3, 2, 2};
        Set<Integer> set = new HashSet<>();
        Set<Integer> s = Arrays.stream(arr).filter(a -> !set.add(a)).collect(Collectors.toSet());*/

        //Fibonacci
        /*Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));*/

//        List<Integer> nums=Arrays.asList(1,4,5,6,4,332,0);
//        int[] aa={1,5,3,7,4,32,34};
//        System.out.println(nums.stream().min(Comparator.naturalOrder()));
//        nums.stream().mapToInt(a -> a.intValue()).sum(); // map Integer to int


        //count number of string that start with specific char
        /*List<String> list=Arrays.asList("hDeep","hRam","Shyam","Krishna");
       Map<String,Long> mp= list.stream().filter(a -> a.charAt(0)=='h').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);*/

//        List<Double> floatNums=Arrays.asList(1.3,2.4,9D);
//        System.out.println(floatNums.stream().mapToDouble(a -> a.doubleValue()).average());


List<String> list=Arrays.asList("deep","Ram","Shyam","deep");
//        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));



List<Integer> list1=Arrays.asList(2,5,7,9,9,11,11);
//        System.out.println(list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst());


    }
}

