package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*Main(){
        //System.out.print("This is default constructor..");
    }*/

    public void m1(){
        //String s = "";
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        Object obj = getData();
        if(obj!=null) {
            System.out.println(obj.toString());
        }
    }

    public Object getData() {
        return null;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Main obj = new Main();
        obj.m1();
    }
}