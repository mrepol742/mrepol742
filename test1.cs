using System;
namespace test1 {
    class Program {
        static void Main(string[] args) {
        Console.WriteLine("Enter Item Name:");
        String itemName = Console.ReadLine();
        Console.WriteLine("Enter Price:");
        int price = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter Quantity:");
        int quantity = int.Parse(Console.ReadLine());
        Console.WriteLine("Total Amount to be is {0}", price * quantity);
        }
    }
}