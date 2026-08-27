package JavaBeginerPractice;

import java.util.Scanner;
public class ScannerInputPractice {

    public static  void main (String [] args){

        System.out.println("============= Dear Eusha Wellcome to the CRO Interview ====== ");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Tell Me about yourself Eusha : ");
        String answer1 = scanner.nextLine();
        System.out.println("Tell me a situation you've handled in ur previous site :  ");
        String answer2 = scanner.nextLine();
        System.out.println("Thank you for your recent application for the Control Room Operator" +
                " role. Unfortunately, on this occasion," +
                " we will not be moving forward with your application."
               );


        scanner.close();
    }
}


// so basically as a beginner i just work here with Scanner class and user Input and basic coding practic.
