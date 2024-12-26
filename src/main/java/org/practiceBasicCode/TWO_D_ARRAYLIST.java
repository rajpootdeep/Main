package org.practiceBasicCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TWO_D_ARRAYLIST {
    public static void main(String[] args) {
        Student[][] s = new Student[2][3];
        s[0][0] = new Student("Deep");
        s[0][1] = new Student("100");
        s[0][2] = new Student("Math");
        s[1][0] = new Student("Ram");
        s[1][1] = new Student("101");
        s[1][2] = new Student("Ramayana");
        ArrayList<Student> st = null;

        ArrayList<ArrayList<Student>> ar = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            st = new ArrayList<>();
            for (int j = 0; j < s[i].length; j++) {

                st.add(s[i][j]);
            }
            ar.add(st);
        }

        System.out.println(ar.size());

        for (ArrayList<Student> a : ar) {
            for (Student ss : a) {
                System.out.println(ss.getStr());

            }
        }

//   Try assigning 2D array to 2D arrayList dircetly

        System.out.println(Arrays.asList(s));
        List<Student[]> l = Arrays.asList(s);
        System.out.println();


    }

}

//Student Class
class Student {
    String str;

    public Student(String str) {
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }

    public void setStr(String s) {
        this.str = s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "str='" + str + '\'' +
                '}';
    }
}
