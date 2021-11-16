using System;
namespace exercise6 {
    class Program {
        static void Main(string[] args) {
        Console.Write("Enter the first score: "); 
        double number1 = double.Parse(Console.ReadLine());
        Console.Write("Enter the second score: "); 
        double number2 = double.Parse(Console.ReadLine());
        Console.Write("Enter the third score: "); 
        double number3 = double.Parse(Console.ReadLine());
        Console.Write("Enter the forth score: "); 
        double number4 = double.Parse(Console.ReadLine());
        Console.Write("Enter the fifth score: "); 
        double number5 = double.Parse(Console.ReadLine());

        double aveg = (number1 + number2 + number3 + number4 + number5) / 5;

        Console.WriteLine("The average is {0}", aveg);
        }
    }
}