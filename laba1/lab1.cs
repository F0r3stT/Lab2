using System;



class Program {
    static void Main() {
        Console.Write("Enter number: ");
        int N = int.Parse(Console.ReadLine());
        Console.Write("Enter position: ");
        int P = int.Parse(Console.ReadLine());

        if (N < 0 || P < 0) {
            Console.WriteLine("Incorrect value");
            return;
        }

        int c = 0;
        while (N > 0) {
            int digit = N % 10;
            c++;
            if (c == P) {
                Console.WriteLine("well done: " + digit);
            }
            N /= 10;
        }
    }
}
