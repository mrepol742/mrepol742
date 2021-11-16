using System;
namespace exercise7 {
    class Program {
        static void Main(string[] args) {
        Console.Write("Enter the grade of the following...\n\n"); 
        Console.Write("Introduction to Computing: "); 
        double number1 = double.Parse(Console.ReadLine());
        Console.Write("Computer Programming 1: "); 
        double number2 = double.Parse(Console.ReadLine());
        Console.Write("Mathematics in the Modern World: "); 
        double number3 = double.Parse(Console.ReadLine());
        Console.Write("Purposive Communication: "); 
        double number4 = double.Parse(Console.ReadLine());
        Console.Write("Understanding Self: "); 
        double number5 = double.Parse(Console.ReadLine());
         Console.Write("Self Testing Activities: "); 
        double number6 = double.Parse(Console.ReadLine());
         Console.Write("CWTS: "); 
        double number7 = double.Parse(Console.ReadLine());

        double aveg = (number1 + number2 + number3 + number4 + number5 + number6 + number7) / 7;

        Console.WriteLine("The average grade is {0}", aveg);
        }
    }
}