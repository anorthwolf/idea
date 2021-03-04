package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class TemplateClassTest {
    //prsf
    //1 psvm
    public static void main(String[] args) {

        System.out.println("hi");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateClassTest.main");
        System.out.println("args = " + args);

    }

    public void add(){
        System.out.println();
        System.out.println("TemplateClassTest.add");
        int i = 1;
        System.out.println("i = " + i);
        System.out.println(i);

        String s = "abc";
        System.out.println(s);

        for (int j = 0; j < 10; j++) {
            System.out.println("TemplateClassTest.add");
            System.out.println(j);
        }

        String[] arr = new String[]{"a","jerry"};
        for (String s1 : arr) {
            System.out.println("s1 = " + s1);
            System.out.println("TemplateClassTest.add");

        }
        for (String s1 : arr.length) {
            System.out.println("s1 = " + s1);
        }

        for (int j = 0; j < arr.length; j++) {
            String s1 = arr[j];
        }

        ArrrayList list = new ArrrayList();
        list.add(123);
        list.add(235);
        list.add(122);


    }


        public  void test1(){
            ArrrayList list = new ArrrayList();
            list.add(123);
            list.add(235);
            list.add(122);

            if (list == null) {
            }

            if (list != null) {
            }

            if (list != null) {

            }


        }

        public void test(){
            //test template
        }

        //
    /**
    * id
    */
    private int id = 5;


    /**
    * string1
    */
    private string s1 = "ss";





}
