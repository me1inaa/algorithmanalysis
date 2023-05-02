package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class AlgorithmAnalysis {
    public static void main(String[] args) {
        // instantiate a random object
        Random rand = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many Students would you like to create? ");
        int numStudents = scan.nextInt();
        //create an array of randomly generated students using 
        //the generateStudents method
        Student[] students = Student.generateStudents(numStudents);
        // fill the array with random student objects that is unsorted
        // print the array
        System.out.println("Unsorted Array of Students: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // create a sorting method that sorts the students by gpa
    public static void sortByGpa(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getGpa() < students[minIndex].getGpa()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = students[minIndex];
                students[minIndex] = students[i];
                students[i] = temp;
            }
        }
    }

    //helper method that will shuffle the array
    public static void shuffleArray(Student[] students) {
        Random rand = new Random();
        for (int i = students.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            Student temp = students[index];
            students[index] = students[i];
            students[i] = temp;
        }
    }

    //sequential method that will sort the array by id
    public static int sequentialSearchById(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    //binary sort method that will sort the array by graduation year
    public static int binarySearchByGraduationYear(Student[] students, int graduationYear) {
        int low = 0;
        int high = students.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (graduationYear < students[mid].getGraduationYear()) {
                high = mid - 1;
            } else if (graduationYear > students[mid].getGraduationYear()) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
 