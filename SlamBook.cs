using System;
namespace SlamBook {
    class Program {
        static void Main(string[] args) {
            String realN, nickN, hiddenT, favFood, favExpression, motto, lastT, cry, one, love;
            Console.WriteLine("Whats your realname?");
            realN = Console.ReadLine();
            Console.WriteLine("Whats your nickname?");
            nickN = Console.ReadLine();
            Console.WriteLine("Whats your hidden talents?");
            hiddenT = Console.ReadLine();
            Console.WriteLine("Whats your favorite food?");
            favFood = Console.ReadLine();
            Console.WriteLine("Whats your favorite expression?");
            favExpression = Console.ReadLine();
            Console.WriteLine("Whats your motto in life?");
            motto = Console.ReadLine();
            Console.WriteLine("Last time you got kilig?");
            lastT = Console.ReadLine();
            Console.WriteLine("What makes you cry?");
            cry = Console.ReadLine();
            Console.WriteLine("One word that describe you?");
            one = Console.ReadLine();
            Console.WriteLine("What is love?");
            love = Console.ReadLine();
            Console.WriteLine("\n\n");
            Console.WriteLine("SLAM BOOK");
            Console.WriteLine("Realname:                   {0}", realN);
            Console.WriteLine("Nicknamae:                  {0}", nickN);
            Console.WriteLine("Hidden Talents:             {0}", hiddenT);
            Console.WriteLine("Favorite Food:              {0}", favFood);
            Console.WriteLine("Favorite Expression:        {0}", favExpression);
            Console.WriteLine("Motto in Life:              {0}", motto);
            Console.WriteLine("The last time got kilig:    {0}", lastT);
            Console.WriteLine("What makes me cry:          {0}", cry);
            Console.WriteLine("One word that described me: {0}", one);
            Console.WriteLine("What is love:               {0}", love);
        }
    }
}