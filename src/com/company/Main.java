package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {



    public static void main(String[] args) {
	// write your code here
        MyArrayList lijst = new MyArrayList();
        lijst.add("Karen");
        lijst.add("Kristel");
        lijst.add("Kathleen");
        System.out.println(lijst);
    }
}
class MyArrayList extends ArrayList<String> {
    // @Override
    //    public String toString() {
    //        return String.format("{%s}", String.join(";",this));
    //    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(this.get(0));
        for (int i = 1; i < this.size (); i++) {
            sb.append(";");
        }
            return sb.toString();


        }

    }





