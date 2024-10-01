package com.example.project;
public class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 
        Student student = new Student("Tyler", "Walters", 2026);
        student.addTestScore(100);
        student.addTestScore(95);
        student.addTestScore(98);
        student.printStudentInfo();

    }
}