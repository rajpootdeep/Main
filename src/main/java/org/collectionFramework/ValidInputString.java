package org.collectionFramework;

import java.util.Stack;

public class ValidInputString {
    public static void main(String[] args) {
        String s = "{()}";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c== '{' || c=='[' || c== '('){
                st.push(c);
            } else if (!st.isEmpty()) {
                if(c==']' || c== '}' || c==')'){
                    if(c== ']' && st.peek() == '[') st.pop();
                    else if(c== '}' && st.peek() == '{') st.pop();
                    else if(c== ')' && st.peek() == '(') st.pop();
//                    if (st.peek() == '(' || st.peek() =='[' || st.peek()== '{') st.pop();
                }
            }


        }
        System.out.println(st.isEmpty());
    }
}
