package org.test;

 public interface A1 {

     void absMethod();
    default void m1(){
        System.out.println("m1 from A1");
    }
}
