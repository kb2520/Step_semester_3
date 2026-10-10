package main.java.week1.class_problems;

import java.util.Scanner;

public class VIP{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input");
        String c1=sc.nextLine();

        char[] arr=c1.toCharArray();

        if(arr[0]=='V'){
            System.out.println("u r VIP cus.");}
        else{System.out.println("u r regular cus.");}
    }}


