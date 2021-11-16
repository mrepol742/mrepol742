using System;
namespace lengthConverter {
    class Program {
        static void Main(string[] args) {
            Console.WriteLine("Meter to Kilometer");
            Console.WriteLine("Enter meter:");
            double len = double.Parse(Console.ReadLine());
            double kilo = 0;
            kilo = len / 1000;
            Console.Write("The kilometer of {0} is {0}", len, kilo);
        }
    }
}