package Strings;

import java.util.Scanner;


public class Two extends Exception{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter string");
        String s=s1.nextLine(),s2="";
        if(!Character.isDigit(s.charAt(0)))
            System.out.println("0");
        else{
            for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || s.charAt(i)=='-')
                s2+=s.charAt(i);
            }
            System.out.println(s2);
        }
        
    }
}
