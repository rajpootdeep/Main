package org.test;

public interface Animal {
    default void bark(){
        System.out.println("in animal");
    }
   default void ram(){
        System.out.println("ram");
    }

}
