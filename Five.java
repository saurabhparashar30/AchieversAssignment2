package Strings;

import java.util.Scanner;


public class Five {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        String s[]=new String[s1.nextInt()];
        System.out.println("Enter strings");
        for(int i=0;i<s.length;i++)
            s[i]=s1.next();
        String str=s[0];
        for(String i:s)
            str=findCommon(str,i);
        System.out.println("Common Prefix: "+str);
    }
    static String findCommon(String s1,String s2){
        String s="";int i=0;
        while(i!=s1.length() && i!=s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                s+=s1.charAt(i);
                i++;
            }
            else break;
        }
        return s;
    }
}
