package edu.guilford;

import java.util.Random;

public class Student {
    
    //declare student attributes
    private int id;
    private double gpa;
    private String grade;
    private boolean athlete;
    private int graduationYear;

    //instantiate a random object
    Random rand = new Random();
    

    //constructor for student
    public Student() {
        this.id = rand.nextInt(100000, 1000000);
        this.gpa = rand.nextDouble() * 4.0;
        this.grade = generateGradeLevel();
        this.athlete = rand.nextBoolean();
        this.graduationYear = rand.nextInt(2023, 2040);
    }

    //getters and setters for student attributes
    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGrade() {
        return grade;
    }

    public boolean isAthlete() {
        return athlete;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAthlete(boolean athlete) {
        this.athlete = athlete;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    //create a method that generates a random grade level
    public String generateGradeLevel() {
        String[] grades = {"Freshman", "Sophomore", "Junior", "Senior"};
        return grades[rand.nextInt(grades.length)];
    }

    //toString method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", grade='" + grade + '\'' +
                ", athlete=" + athlete +
                ", graduationYear=" + graduationYear +
                '}';
    }

    //create a method that generates random students
    public static Student[] generateStudents(int numStudents) {
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
        }
        return students;
    }




    



}
