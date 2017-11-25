//Author: Ovidio Castillo
//Purpose: To find addition, power and Square roots
//Date: 11/02/2017

import java.util.Scanner;

public class Functions {
    //main method
    public static void main(String [] args) {

        System.out.println("Sum "+f(input()));
        System.out.println("To the 10th Power " + power(input()));
        System.out.println("Square Root "+ root(input()));
        System.out.println("Absolute Value: "+absolute(input()));
        //System.out.println(sum);
    }
    //x+y method
    public static int f(int x) {
        return x + 1;

    }
    //power of 10 method
    public static int power(int x){
        return x*x*x*x*x*x*x*x*x*x;
    }
    //square root method

    public static double root(int x) {
        return Math.sqrt(x);
    }
    //absolute value method
    public static int absolute(int x) {
        return (x>=0)?x:(-1*x);
    }


    // user input
    public static int input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        return keyboard.nextInt();
    }
}
