package com.Sorting;

class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    // Getter methods
    public int getStudentage() {
        return studentage;
    }

    @Override
    public int compareTo(Student comparestu) {
        int compareage = comparestu.getStudentage();
        /* For Ascending order */
        return this.studentage - compareage;

        /* For Descending order do like this */
        // return compareage - this.studentage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}