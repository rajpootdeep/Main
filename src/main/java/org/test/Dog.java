package org.test;

public class Dog implements Animal {
//   @Override
   public void bark(){
Animal.super.bark();
       System.out.println("in dog");

   }

}
