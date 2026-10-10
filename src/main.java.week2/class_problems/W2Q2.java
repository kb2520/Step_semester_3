package main.java.week2.class_problems;

import java.util.Scanner;
public class W2Q2{

    static void StudentRecord(String csvLine){
        String CS[]=csvLine.split(",");

        if (CS.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + CS[0]
                + " | Roll No: " + CS[1]
                + " | Dept: " + CS[2]);}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String ne = sc.nextLine();

        StudentRecord(ne);
    }
}
