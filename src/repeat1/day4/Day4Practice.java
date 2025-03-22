package repeat1.day4;

import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        int num2 = sc.nextInt();
//        System.out.print("세 번째 숫자를 입력하세요: ");
//        int num3 = sc.nextInt();
//
//        int maxNum;
//
//        if (num1 > num2) {
//            if (num1 > num3) {
//                maxNum = num1;
//            } else if(num1 <= num3) {
//                maxNum = num3;
//            }
//        } else if (num1 <= num2){
//            if (num2 > num3) {
//                maxNum = num2;
//            } else {
//                maxNum = num3;
//            }
//        }
//
//        if (num1 > num2 && num1 > num3) {
//            maxNum = num1;
//        } else if (num2 > num1 && num2 > num3) {
//            maxNum = num2;
//        } else if (num3 > num1 && num3 > num2) {
//            maxNum = num3;
//        }


        System.out.print("월을 입력하세요 (1~12): ");
        int month = sc.nextInt();

        int season = (month % 12) / 3;

        switch (season) {
            case 0:
                System.out.println("입력하신 월에 해당하는 계절은: 겨울");
                break;
            case 1:
                System.out.println("입력하신 월에 해당하는 계절은: 봄");
                break;
            case 2:
                System.out.println("입력하신 월에 해당하는 계절은: 여름");
                break;
            case 3:
                System.out.println("입력하신 월에 해당하는 계절은: 가을");
                break;

        }


    }
}
