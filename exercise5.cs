using System;
namespace exercise5 {
    class Program {
        static void Main(string[] args) {
        Console.Write("Enter the amount of Meter: "); 
        double kilograms = double.Parse(Console.ReadLine());
        double grams = kilograms / 1000;
        Console.WriteLine("Kilometer: {0}", grams);
        }
    }
}