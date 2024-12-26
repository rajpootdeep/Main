package org.SOLID.LSP;

public interface AB {
     void accept();
     default void myTestAB(){
          System.out.println("in ab");
     }
     static void myTestABStatic(){
          System.out.println("in ab static");
     }

}
