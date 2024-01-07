package com.Sorting;
import java.util.*;

public class ArrayListSorting {

    public static void main(String args[]) {
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(223, "Vijay", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 25));
        arraylist.add(new Student(230, "Kiran", 23));

        Collections.sort(arraylist);

        for (Student student : arraylist) {
            System.out.println(student);
        }
    }
}
