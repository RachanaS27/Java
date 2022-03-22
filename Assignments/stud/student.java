package Assignments.stud;

import Assignments.fact.faculty;

public class student {
    
    int rollNum;
    String name;
    int marks;
    public student() {
    }
    public student(int rollNum, String name, int marks) {
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    
    public int getRollNum() {
        return rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public static void main(String[] args) {
        student[] s1 =new student[4];
        s1[0] = new student(1, "ashwin", 98);
        s1[1] = new student(2, "anup", 87);
        s1[2] = new student(3, "anusha", 65);
        s1[3] = new student(4, "barath", 75);
        
        faculty f1 = new faculty();
        int marks =f1.getStudentMarks(3,s1);
        System.out.println(marks);
    }

    
}
