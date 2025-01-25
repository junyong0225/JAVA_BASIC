package day2;

import java.util.Scanner;

public class Day2practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("출생 연도를 입력하세요: " );
//        int i = sc.nextInt();
//        System.out.println("당신의 나이는 = " + (2025 - i + 1));

        System.out.println("사각형의 가로 길이를 입력하세요: ");
        int a = sc.nextInt();

        System.out.println("사각형의 세로 길이를 입력하세요: ");
        int b = sc.nextInt();

        double result = a * b;
        System.out.println("사각형의 넓이는 " + result + "입니다.");
    }
}
