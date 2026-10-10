package main.java.week2.class_problems;
import java.util.Scanner;

public class W2Q1{
    static void countVowelsAndConsonants(String text){

        int v=0,c=0;

        text=text.toLowerCase();

        text=text.replaceAll(" ","");

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)== 'a'|| text.charAt(i)==  'e'||text.charAt(i)== 'i'||text.charAt(i)== 'o'||text.charAt(i)== 'u'){

                v++;
            }else{c++;}

        }

        System.out.print("Vowels:"+v+"Constants"+c);
    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);



        System.out.print("Enter your sentence(only vowels adn :");
        String Input=sc.nextLine();
        countVowelsAndConsonants(Input);

    }
}





