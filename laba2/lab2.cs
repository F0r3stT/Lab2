using System;

class Program {
    static int SearchColor(string r) {
        if (r.Length % 2 != 0) {
            Console.WriteLine("Incorrect value");
            return 0;
        }

        int c = 0;
        int[] VecR = new int[10];
        int[] VecW = new int[10];
        int[] VecB = new int[10];

        for (int i = 0; i < r.Length; i += 2) {
            char color = r[i];
            int cod = r[i + 1] - '0';

            if (color == 'R') VecR[cod] = 1;
            else if (color == 'W') VecW[cod] = 1;
            else if (color == 'B') VecB[cod] = 1;
        }

        for (int i = 0; i < 10; i++) {
            if (VecR[i] == 1 && VecW[i] == 1 && VecB[i] == 1) c++;
        }

        return c;
    }

    static void Main() {
        Console.Write("Enter rods: ");
        string a = Console.ReadLine();
        Console.WriteLine("Number of rods: " + SearchColor(a));
    }
}
