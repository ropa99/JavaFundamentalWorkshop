package org.javafundamentalsworkshop;
import java.util.Scanner;
public class Calculator {
        int test = 0;



    public static void main(String[] args) {
         int number1;
         int number2;
         int menuChoice;
         int result;
        Scanner sc = new Scanner(System.in);
        do {
           //number1=0;
            //number2=0;
            printMenu(sc);
            System.out.print("Pick a number from the menu: ");
            menuChoice = sc.nextInt();
            switch(menuChoice){
                case 1: number1=getOneNumber(sc,"FirstNumber: ");
                        number2=getOneNumber(sc,"SecondNumber: ");
                        System.out.println("Result: " + getAddition(number1,number2));
                        break;

                case 2: number1=getOneNumber(sc,"FirstNumber: ");
                        number2=getOneNumber(sc,"SecondNumber: ");
                        System.out.println("Result: " + getSubtraction(number1,number2));
                        break;
                case 3: number1=getOneNumber(sc,"FirstNumber: ");
                        number2=getOneNumber(sc,"SecondNumber: ");
                        System.out.println("Result: " + getMultiplication(number1,number2));
                        break;
                case 4:
                        number1=getOneNumber(sc,"FirstNumber: ");
                        number2=getOneNumber(sc,"SecondNumber: ");
                        System.out.println("Result: " + getDivision(number1,number2));
                        break;


            }


        }while (menuChoice!=5) ;

    }

    public static void  printMenu(Scanner sc){
        System.out.println("*******************");
        System.out.println("Calculator");
        System.out.println("*******************"); 
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");


    }

    public static int getOneNumber(Scanner sc, String msg){
        System.out.print(msg );
        return sc.nextInt();
    }

    //Add 2 number and print the result
    public static int getAddition(int n1, int n2){
        return n1*n2;

    }
    //Subtract 2 numbers sand print the result
    public static int getSubtraction(int n1, int n2){

            int res = 0;
            //Check for minus values
            if(n1 > n2)
                res = n1-n2;
            else if (n1 < n2)
                res = n2-n1;
            else
                res = n1-n2;
           return res;




    }
    public static int getMultiplication(int n1, int n2){


            return n1+n2;



    }
    public static int getDivision(int n1, int n2){


            return n1/n2;



    }



}
