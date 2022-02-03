package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Write a Java program to convert minutes into a number of hours,
     * print count of hours and minutes. Input minutes from console
     */
    public static void convert(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your number: ");
        int num1 = sc.nextInt();

        System.out.print("That is minutes:" + num1);

        System.out.println();

        int minut = num1 % 60;
        int hour = (num1 / 60) % 60;


        System.out.println("This is minutes of my input number: " + minut);
        System.out.println("That is hours of my input number: " + hour);
        System.out.print(hour + ":" + minut);
        System.out.print("\n");

    }

    /**
     * Find the sum of
     * - the first 4 consecutive odd numbers
     * - the first 4 consecutive even numbers
     */
    public static void sumOddAndEven(){
        int sumOdd = 0;
        int sumEven = 0;
        int nums[] = {8,7,5,88,9,1,3};

        for (int a:nums) {


            if (a%2==0){

                sumOdd+=a;

            }}
        System.out.println("Sum of odd : "+sumOdd);
        for (int a:nums) {


            if (a%2 != 0){

                sumEven+=a;

            }}
        System.out.println("Sum of even: : "+sumEven);
    }

    /**
     * Write a Java program  that takes two numbers as input from the console
     * and display the product of two numbers.
     */
    public static void productOfNumbers(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers:");

        System.out.print("The first number: ");
        double num1 = sc.nextDouble();
        System.out.println();
        System.out.print("The second number: ");
        double num2 = sc.nextDouble();

        System.out.println();
        double product = num1 * num2;

        System.out.println("The first input number: " + num1);
        System.out.println("The second input number: " + num2);
        System.out.println("Product of two input numbers: " + product);

    }

    /**
     * Input from console 3 arguments and then prints the sum,
     * the average;
     */
    public static void sumAndAverage(){

        double sum = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input 3 arguments from console and input sum and average:");

        System.out.print("The first numbers:");
        double num1 = sc.nextDouble();
        System.out.println();

        System.out.print("The second numbers:");
        double num2 = sc.nextDouble();
        System.out.println();

        System.out.print("The third numbers:");
        double num3 = sc.nextDouble();
        System.out.println();

        sum = num1 + num2+num3;
        average = (num1 + num2+num3)/3;
        System.out.println("Sum of 3 input numbers: "+sum);
        System.out.println("Average of 3 input numbers: " + average);

    }

    /**
     * Write a java program to calculate area of a
     * -right-angled triangle
     *          -square
     *          -rectangle
     */
    public static void calculateArea(){

        double S = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input sides that is calculate area: " );
        System.out.println("a: right-angled triangle--");

        System.out.println();
        System.out.print("The first side:");
        double num1 = sc.nextDouble();
        System.out.println();

        System.out.print("The second side:");
        double num2 = sc.nextDouble();
        System.out.println();

        System.out.print("The third side:");
        double num3 = sc.nextDouble();
        System.out.println();

        if (num1>num2 && num1>num3){

            System.out.println("num1 is rifleman from ight-angled triangle and = : "+num1);
            S = num2*num3/2;
            System.out.println("Area of ight-angled triangle: " + S);
        }else if (num2>num1 && num2>num3){

            System.out.println("num1 is rifleman from ight-angled triangle and = : "+num2);
            S = num1*num3/2;
            System.out.println("Area of ight-angled triangle: " + S);

        }else {

            System.out.println("num3 is rifleman from ight-angled triangle and = : "+num3);
            S = num1*num2/2;
            System.out.println("Area of ight-angled triangle: " + S);

        }
        System.out.println();

        System.out.println("b: square--");
        System.out.println();
        System.out.print("The first side:");
        double side1 = sc.nextDouble();
        System.out.println();

        System.out.print("The second side:");
        double side2 = sc.nextDouble();
        System.out.println();

        if (side1 == side2){
        S = side1 * side2;
        System.out.println("Area of square: "+ S);}else{
            System.out.println("this isn't square!!!!");}

        System.out.println("c: rectangle--");
        System.out.println();
        System.out.print("The first side:");
        double sid1 = sc.nextDouble();
        System.out.println();

        System.out.print("The second side:");
        double sid2 = sc.nextDouble();
        System.out.println();

        S = sid1 * sid2;
        System.out.println("Area of rectangle: "+ S);

    }

    /**
     * In program we have byte b, short c , int a,  variables, print result of these actions
     *          -  print average of them
     *          -  print product of them
     */
    public static void printAverageAndProduct(){

        double average;
        int product;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Values: ");
        System.out.println();
        System.out.print("byte b = ");
        byte b = scanner.nextByte();
        System.out.println();
        System.out.print("short c = " );
        short c = scanner.nextShort();
        System.out.println();
        System.out.print("int a = " );
        int a = scanner.nextInt();


        System.out.println();

        average = (b + c + a)/3;
        System.out.println("print average of them: " + average);

        product = b * c * a;
        System.out.println("print product of them: " + product);

        /*byte b = 4;
        short c = 889;
        int a = 5642;*/

       // average = (b+c+a)/3;

    }

    /**
     * 	Given arithmetic sequence Sn  = 3n*n - 12n
     * -	print the sum S10
     * -	print the sum S15
     * @param n
     * @return
     */
    public static int arithmeticSequence(int n){
        return 3*n*n - 12*n;
    }

    /**
     * 9.	Given int number,input from console, find last digit and print it.
     */
    public static void numberLastDigit(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input int number: ");
        int num = sc.nextInt();

        System.out.println();
        if (num>10){

            int find = num % 10;

            System.out.println("find last digit: "+find);
        }else System.out.println("last digit:"+num);
    }

    /**
     *      11.    Given int numbers ,input a and b from console,
     *      determine and print the determine from  a to b
     */
    public static void determineRemainder(){

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println();
        System.out.print("Input b: ");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.println("determine : " + a%b);
    }

    /**
     *     12. Generate and print random integer number;
     */
    public static void randomInteger(){

        Random random = new Random();

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of integer type: ");
        int a = scanner.nextInt();

        int random_num = random.nextInt(a);

        System.out.println("this is random number from Integer type: "+random_num);
    }

    /**
     *    13. Generate and print random integer number
     *    between 0 to       15(bound)
     *       14. Generate and print random integer number between 15 to 30
     */
    public static int randomByBoud(int x, int y){

        Random random = new Random();

        int boundrandom = random.nextInt((y - x) + 1) + x;

        return boundrandom;

    }

    /**
     * Write java program which determines if the given int number is odd,
     * print result(use == operator, use boolean primitive type).
     */
    public static void oddCheck(){

        boolean t = true;
        boolean f = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of integer type: ");
        int num = sc.nextInt();

        if (num % 2 != 0){

            System.out.println("Print the odd: " + num + " " + t);
        }else System.out.println("Print the even: " + " " + f);
    }

    /**
     * Given an integer 3-digit number,
     * determine and print the second digit. Input number from console.
     */
    public static void printSecondDigit(){

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Input number of integer 3-digit:");
        int num = sc.nextInt();

        int second_digit = (num/10) % 10;
        System.out.println("the second digit is : " + second_digit);
       /* int x = 478;

        int b = x/10;
        int c = b%10;
        System.out.println(c);*/

    }

    /**
     * Given an integer  3-digit number,
     * determine and print the first digit. Input number from console.
     */
    public static void printFirstDigit(){

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Input number of integer 3-digit:");
        int num = sc.nextInt();

        int first_digit = num/100;
        System.out.println("the first digit is : " + first_digit);
        /*int x = 787;

        int y = x/100;*/

    }

    /**
     * Given an integer  3-digit number,
     * determine and print the sum of all 3 digits. Input number from console.
     */
    public static void printNumberDigit(){

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Input number of integer 3-digit:");
        int num = sc.nextInt();

        int first_digit = num/100;
        System.out.println("the first digit is : " + first_digit);

        int second_digit = (num/10) % 10;
        System.out.println("the second digit is : " + second_digit);

        int thirth_digit = num % 10;
        System.out.println("the thirth digit is : " + thirth_digit);



    }

    /**
     * Given 2 integer numbers, swap them,
     * Input numbers from console.
     */
    public static void swapNumber(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input 2 numbers of integer type: ");

        System.out.print("the first number is: " );
        int x = sc.nextInt();
        System.out.println("the first number is: "+x);
        System.out.println();

        System.out.print("the second number is: " );
        int y = sc.nextInt();
        System.out.println("the first number is: "+y);
        System.out.println();

        x= x+y;
        y = x-y;
        x = x-y;

        System.out.println("swapping: "+" first = " + x + ", second = " + y);

        /*int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;*/
    }

    public static void main(String[] args) {

        convert();
        System.out.println("******************************");

        sumOddAndEven();
        System.out.println("///////////////////////////////");

        productOfNumbers();
        System.out.println("--------------------------------");

        sumAndAverage();
        System.out.println("+++++++++++++++++++++++++++++++++");

        calculateArea();
        System.out.println("''''''''''''''''''''''''''''''''''");

        printAverageAndProduct();
        System.out.println("==================================");

        System.out.println("S10 = "+arithmeticSequence(10));
        System.out.println("S15 = "+arithmeticSequence(15));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        numberLastDigit();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        determineRemainder();
        System.out.println(":::::::::::::::::::::::::::::::::::");

        randomInteger();
        System.out.println("####################################");

        System.out.println("random integer number between" +
                " 0 to 15(bound): "+randomByBoud(0,15));
        System.out.println("random integer number between 15 to 30: "+ randomByBoud(15,30));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        oddCheck();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        printSecondDigit();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        printFirstDigit();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        printNumberDigit();
        System.out.println("****************************************");

        swapNumber();


    }
}
