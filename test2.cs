using System;
namespace test2 {
    class Program {
        static void Main(string[] args) {
        Console.WriteLine("Enter Pupil's Name:");
        String name = Console.ReadLine();
        Console.WriteLine("English:");
        double english = double.Parse(Console.ReadLine());
        Console.WriteLine("Filipino:");
        double filipino = double.Parse(Console.ReadLine());
        Console.WriteLine("Mathematics:");
        double mathematics = double.Parse(Console.ReadLine());
        Console.WriteLine("Science:");
        double science = double.Parse(Console.ReadLine());
        Console.WriteLine("Araling Panlipunan:");
        double aralingPanlipunan = double.Parse(Console.ReadLine());
        Console.WriteLine("MAPEH:");
        double mapeh = double.Parse(Console.ReadLine());
        Console.WriteLine("Mother Tongue:");
        double motherTongue = double.Parse(Console.ReadLine());
        double average = (english + filipino + mathematics + science + aralingPanlipunan + mapeh + motherTongue) / 7;
        Console.WriteLine("The average grade is: {0}", average);
        }
    }
}