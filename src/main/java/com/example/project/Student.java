package com.example.project;
import java.util.Scanner;

public class Student {

    Scanner scan = new Scanner(System.in);

    // instance variables for 
    // first name (String)
    private String fName;
    // last name (String)
    private String lName;
    // graduation year (int)
    private int gradYear;
    // sum of test scores (double).. should initialize at 0.0
    private double sumScore = 0.0;
    // test score count (int) ..should initialize at 0
    private int scoreCount = 0;
    // highest test score (double).. should initialize at 0.0
    private double highestScore = 0.0;

    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        fName = firstName;
        lName = lastName;
        this.gradYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return fName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return scoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        sumScore += newTestScore;
        scoreCount ++;
        if(newTestScore > highestScore) {
            highestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if((sumScore / scoreCount) >= 65) {
            return true;
        } else {
            return false; 
        }
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return (sumScore / scoreCount);
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + fName + " " + lName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + scoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + highestScore);
        System.out.println("Is passing: " + isPassing());
    }
 }
 