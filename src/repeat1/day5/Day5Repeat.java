package repeat1.day5;

public class Day5Repeat {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세오" + i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println("안녕하세오" + i);
        }

        int count = 1;
        while (count <= 5) {
            System.out.println("count = " + count);
            count++;
        }

        int countt = 5;
        while (countt >= 1) {
            System.out.println("counbt = " + countt);
            countt--;
        }
    }
}
