package org.test;

public interface A2  {
    void absMethod();
    default void m1(){
        System.out.println("m1 from A2");
    }

}
