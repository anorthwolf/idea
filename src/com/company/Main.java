package com.company;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Date;


public class Main {


    private int num;

    public static void main(String[] args) {
        System.out.println("hello world, IDEA");
    }

    ///test
    void HelloWorld(){
//
        //region Description
        System.out.println("hello world,");
        System.out.println("hi");
        //endregion


        ArrayList list = new ArrayList();


        try {
            newMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void newMethod(){
        num = 0;

    }
}

