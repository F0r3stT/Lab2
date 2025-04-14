import java.util.Scanner;

public class Main {
    public static int searchColor(String r) {
        if (r.length() % 2 != 0) {
            System.out.println("Incorrect value");
            return 0;
        }

        int c = 0;
        int[] vecR = new int[10];
        int[] vecW = new int[10];
        int[] vecB = new int[10];

        for (int i = 0; i < r.length(); i += 2) {
            char color = r.charAt(i);
            int cod = r.charAt(i + 1) - '0';

            switch (color) {
                case 'R': vecR[cod] = 1; break;
                case 'W': vecW[cod] = 1; break;
                case 'B': vecB[cod] = 1; break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (vecR[i] == 1 && vecW[i] == 1 && vecB[i] == 1) c++;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rods: ");
        String input = scanner.nextLine();
        System.out.println("Number of rods: " + searchColor(input));
    }
}
