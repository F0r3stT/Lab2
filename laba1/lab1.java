import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = scanner.nextInt();
        System.out.print("Enter position: ");
        int P = scanner.nextInt();

        if (N < 0 || P < 0) {
            System.out.println("Incorrect value");
            return;
        }

        int c = 0;
        while (N > 0) {
            int digit = N % 10;
            c++;
            if (c == P) {
                System.out.println("well done: " + digit);
            }
            N /= 10;
        }
    }
}
