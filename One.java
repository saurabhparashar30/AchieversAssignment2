package Strings;

import java.util.Scanner;


public class One {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter string");
        System.out.println("First Non-Repeating at index: "+firstNonRepeating(s1.next()));
    }
    static int firstNonRepeating(String str){
        for(int i=0;i<str.length()-1;i++){
            boolean flag=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    flag=true;
            }
            if(!flag)
                return i;
        }
        return -1;
    }
}
