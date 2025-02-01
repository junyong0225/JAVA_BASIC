package day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double result = (double) (num1 + num2 + num3) / 3;
        result = Math.round(result);

        System.out.println("average: " + result);


        double d = 3.5;
        int t = (int) d;
        System.out.println("t = " + t);
    }
}
