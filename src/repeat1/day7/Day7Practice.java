package repeat1.day7;

import java.util.Scanner;

public class Day7Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *  학생 점수 평균 계산
         */
        System.out.print("학생 수를 입력하세요: ");
        int numStudents = sc.nextInt();

        int[] scores = new int[numStudents];

        for (int i =0; i < numStudents; i++) {
            System.out.print("학생들의 점수를 입력해주세요. 학생 " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / numStudents;

        System.out.println("학생들의 평균 점수는: " + average);

        /**
         * 최댓값과 최솟값 찾기
         */

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("숫자를 하나 입력해주세요: ");
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("최댓값은: " + max);
        System.out.println("최솟값은: " + min);
    }
}
