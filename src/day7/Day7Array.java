package day7;

public class Day7Array {
    public static void main(String[] args) {
//        char[] chars = new char[4];
//        chars[0] = 'c';
//        chars[1] = 'h';
//        chars[2] = 'a';
//        chars[3] = 'r';

        int[] ints = {85, 90, 78, 92, 88};

        System.out.println("ints[0] : " + ints[0]);
        System.out.println("ints[1] : " + ints[1]);
        System.out.println("ints[2] : " + ints[2]);
        System.out.println("ints[3] : " + ints[3]);
        System.out.println("ints[4] : " + ints[4]);
        System.out.println("배열의 크기는 : " + ints.length);

        ints[3] = 1;

        for (int i =0; i < ints.length; i++) {
            System.out.println("student " + (i + 1) + ": " + ints[i]);
        }




    }
}
