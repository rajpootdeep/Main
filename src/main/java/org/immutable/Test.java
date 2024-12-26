package org.immutable;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] ar){
        /*Set<Integer> set =new HashSet<>();
        //set.add(1);
        ImmutableClass immutableClass=new ImmutableClass(0,"Deep",set );
        //set.add(7);
        System.out.println(immutableClass.getId() +"   "+immutableClass.getName()+"   "+immutableClass.getSet()+" "+immutableClass);
        immutableClass.getSet().add(3);
        System.out.println(immutableClass.getId() +"   "+immutableClass.getName()+"   "+immutableClass.getSet()+" "+immutableClass);
*/

        //String s="Deep";
        //String s1="deep";
        //String s3=new String("Deep");
        System.out.println("Deep".intern());
//        System.out.println(s.hashCode()+"   "+s1.hashCode());

    }
}
