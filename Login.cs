using System;

namespace Login {

    class Program {

        static void Main(string[] args) {
            String[] usernames = new String[]{"admin", "admin234", "admin56", "admin9", "admin2"};
            String[] passwords = new String[]{"4969a", "2479b", "2426c", "3525d", "9726e"};
            Console.WriteLine("-- LOGIN --");

            Console.WriteLine("Please enter one of the admin credentials:");

            Console.Write("Username: ");
            String username = Console.ReadLine();
            Console.Write("Password: ");
            String pass = Console.ReadLine();

            for (int i = 0; i < usernames.Length; i++) {
                if (usernames[i] == username) {
                    if (pass == passwords[i]) {
                        Console.WriteLine("Welcome...");
                        System.Environment.Exit(-1);
                    }
                }
            }
            Console.WriteLine("Failed....");
            

        }
    }
}