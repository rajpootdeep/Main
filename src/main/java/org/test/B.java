package org.test;

import java.sql.SQLOutput;

public class B extends A{
    B(){

//        super(3);

        System.out.println("in B Default Constructor");

    }
    void mm(){
        System.out.println(" in B mm method");
    }
    void m(){

        System.out.println("in B m method");
//        super.m();
//        this.mm();

    }
}
