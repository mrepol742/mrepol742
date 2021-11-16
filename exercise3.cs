using System;
namespace exercise3 {
    class Program {
        static void Main(string[] args) {
        Console.Write("Enter the amount of Celsius: "); 
        int celsius = int.Parse(Console.ReadLine());
        Console.WriteLine("Fahrenheit: {0}", (celsius * 9/ 5) + 32);
        }
    }
}