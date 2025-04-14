import java.util.Scanner;

public class Main {
    public static int searchEven(int num) {
        int count = 0;
        while (num > 0) {
            int last = num % 10;
            if (last % 2 == 0) count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int k = sc.nextInt();
            System.out.println(searchEven(k));
        }
    }
}
