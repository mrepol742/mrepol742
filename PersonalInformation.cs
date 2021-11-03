using System;
namespace exercise2 {
    class Program {
        static void Main(string[] args) {
            String name;
            Console.WriteLine("Enter Name:");
            name = Console.ReadLine();
            String address;
            Console.WriteLine("Enter Address:");
            address = Console.ReadLine();
            int age;
            Console.WriteLine("Enter Age:");
            age = int.Parse(Console.ReadLine());
            long contact;
            Console.WriteLine("Enter Contact:");
            contact = long.Parse(Console.ReadLine());
            String occupation;
            Console.WriteLine("Enter Occupation:");
            occupation = Console.ReadLine();
            String emailAdd;
            Console.WriteLine("Enter Email Address:");
            emailAdd = Console.ReadLine();
            String course;
            Console.WriteLine("Enter Course:");
            course = Console.ReadLine();
            String major;
            Console.WriteLine("Enter Major:");
            major = Console.ReadLine();
            float genAverage;
            Console.WriteLine("Enter General Average:");
            genAverage = float.Parse(Console.ReadLine());
            int monAllowance;
            Console.WriteLine("Enter Monthly Allowance:");
            monAllowance = int.Parse(Console.ReadLine()); 
            Console.WriteLine("\n\n\n");
            Console.WriteLine("Dadta entered by the User");
            Console.WriteLine("Name:              {0}", name);
            Console.WriteLine("Address:           {0}", address);
            Console.WriteLine("Age:               {0}", age);
            Console.WriteLine("Contact:           {0}", contact);
            Console.WriteLine("Occupation:        {0}", occupation);
            Console.WriteLine("Email Address:     {0}", emailAdd);
            Console.WriteLine("Course:            {0}", course);
            Console.WriteLine("Major:             {0}", major);
            Console.WriteLine("General Average:   {0}", genAverage);
            Console.WriteLine("Monthly Allowance: {0}", monAllowance);
        }
    }
}