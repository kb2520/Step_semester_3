package main.java.week1.class_problems;
import java.util.Scanner;

public class UniqueLetterGame{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence or word");
        String line = sc.nextLine();
        line = line.replace(" ", "");


        for(int i=0; i<line.length(); i++){
            for(int j=0; j<i; j++){
                if(line.charAt(i)!=line.charAt(j)){
                    System.out.print(line.charAt(i)+" is the First non repeating character.");}
                return;}
        }
    }
}

