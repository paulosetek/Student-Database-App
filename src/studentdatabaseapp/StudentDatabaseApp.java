/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class StudentDatabaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }

        System.out.println(students[0].showInfo());
        System.out.println(students[1].showInfo());

        System.out.println(students[2].showInfo());

    }

}
