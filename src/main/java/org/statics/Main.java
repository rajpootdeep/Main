package org.statics;

public class Main {

    /*
     * Variable
     * static variable are in class area, created at class loading
     *Method
     * static method can not use non static data member or call non-static method directly.
     * this and super cannot be used in static context.
     * static method can not be overide,but can be hiding
     * Block
     * Is used to initialize the static data member.
     * executed before the main method at the time of classloading.
     * Class
     *Static class can access only the static members of its outer class.
     *Outer.StaticNested obj = new Outer.StaticNested();
     * */

    int x = 4;
    static int y = 90;


    public static class nested {
        int j = 0;
      static int jj=990;
        nested(int k) {
            j = k;
        }

        nested() {
        }

        public void t(){
            j=y;
            System.out.println(j);
        }


    }

    public static void main(String[] args) {
        nested obj=new nested();
        Main.nested objj=new Main.nested();
        obj.t();
        Main m=new Main();
        System.out.println(nested.jj);

    }
}
