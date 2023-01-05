package com.company;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String s1 = ("Instinct");
        String s2 = "Instinct";
        String s3;
        s3 = "Instinct";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3.length());
        //length
        String txt = "I LOVE YOU ";
        System.out.println("The length of the txt string is "+txt.length());
        String txt1 = "Hello Guy";
        //toUpperCase and toLowerCase;
        System.out.println(txt1.toUpperCase());
        System.out.println(txt.toLowerCase());
        //index of;
        String txt2 ="Please locate where 'locate' occurs";
        System.out.println(txt2.indexOf("locate"));
        // concat
        String firstname = "Chorn ";
        String lastname ="Thoen";
        System.out.println(firstname.concat(lastname));

        char myChar1 ='A';
        char myChar2 = '6';
        //Character myChar3 = new Character('A');
        System.out.println(Character.isLetter(myChar1));
        System.out.println(Character.isDigit(myChar2));
        //append
        String st = "Welcome" + " " + "to " + "Java";
        System.out.println(st);

        //insert
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, "Java");
        System.out.println(sb);

        //replace
        StringBuffer sr = new StringBuffer("Hello");
        //sr.replace(1, 3, "Java");
        sr.replace(1,3,"java");
        System.out.println(sr);
        //System.out.println("Hello");

        //reverse
        StringBuffer str = new StringBuffer("Hello");
        str.reverse();
        System.out.println(str);

        //
        StringTokenizer st1= new StringTokenizer("My name is thoen"," ");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        StringTokenizer st2 =new StringTokenizer("My,name,is,thoen",",");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        System.out.println("My name is Thoen");
        StringTokenizer st3 = new StringTokenizer("My name is Thoen"," ");
        System.out.println("Output: Word count: "+st3.countTokens()+(" words"));
        System.out.println("-----------------------------");
        var age = 'A';
        System.out.println(age);
    }
}
