package main.java.week1.class_problems;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input");
        String p=sc.nextLine();


        p=p.replaceAll("[^A-Za-z0-9]","");
        String a=p.toLowerCase();
        char[] arr=a.toCharArray();
        char[] ar=a.toCharArray();
        int left=0;
        int right=a.length()-1;
        while (left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        String n= new String(arr);
        String n1= new String(ar);

        if(n1.equals(n)){
            System.out.println("It is palindrome");}
        else{System.out.println("It is not palindrome");





            System.out.print(n);}}}
