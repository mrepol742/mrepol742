using System;
namespace exercise4 {
    class Program {
        static void Main(string[] args) {
        Console.Write("Enter the amount of Kilograms: "); 
        double kilograms = double.Parse(Console.ReadLine());
        double grams = kilograms * 1000;
        Console.WriteLine("Grams: {0}", grams);
        }
    }
}