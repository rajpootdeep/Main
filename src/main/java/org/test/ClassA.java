package org.test;

import javax.sound.midi.Soundbank;

public class ClassA implements A2,A1{


    @Override
    public void absMethod() {

    }

    @Override
    public void m1() {
        System.out.println("m1 from ClassA");
    }

    public static void main(String[] args) {
        A2 a = new ClassA();
        a.m1();
    }
}
