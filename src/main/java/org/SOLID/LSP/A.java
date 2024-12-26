package org.SOLID.LSP;

public abstract class A implements AB{
    @Override
    public void accept() {
        System.out.println("In Abstract class A");
    }
    public abstract void notAccept();
    public void test(){
        System.out.println("Abstarct has nor method in A");
    }
}
