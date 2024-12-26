package org.recursion;

public class KeyPadCombinations {
    public static void main(String[] args) {
        String s="23";
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(s,"",kp);
    }

    private static void combination(String s,String res,String[] kp) {
        if (s.isEmpty()){
            System.out.println(res+" ");
            return;
        }
        int currNum=s.charAt(0)-'0';
        String currChoices=kp[currNum];
        for (int i=0;i< currChoices.length();i++){
            combination(s.substring(1),res+currChoices.charAt(i),kp);
        }

    }
}
