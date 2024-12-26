package org.SOLID.LSP;

public class C extends A{
//    @Override
    public void notAccept(int a) {
        System.out.println("not accerpt with args ");
    }
    public String test(String a){
        System.out.println("a");
        return a;
    }

    @Override
    public void notAccept() {
        System.out.println("not accerpt method in class C extends A abstract Class");
    }
}
