using System;

class Program {
    static int SearchEven(int num) {
        int count = 0;
        while (num > 0) {
            int last = num % 10;
            if (last % 2 == 0) count++;
            num /= 10;
        }
        return count;
    }

    static void Main() {
        Console.Write("Enter number of numbers: ");
        int n = int.Parse(Console.ReadLine());
        for (int i = 0; i < n; i++) {
            Console.Write("Enter number: ");
            int k = int.Parse(Console.ReadLine());
            Console.WriteLine(SearchEven(k));
        }
    }
}
