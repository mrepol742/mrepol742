using System;
namespace act1 {
    class Program {
        static void Main(string[] args) {
        int x = 30;
        int y = 15;
        int z = 45;
        String IDnum = "2020-1";
        String IDpass = "csharp";
        Console.WriteLine((x >= 20) && (x <= 40));
        Console.WriteLine((y < z) || (y < x));
        Console.WriteLine((IDnum != "2020-1") && (IDpass == "csharp"));
        Console.WriteLine(!(z < 50));
        Console.WriteLine((x != 0) && (y != 0));
        Console.WriteLine((x == 30) && (y == 15));
        Console.WriteLine((z <= 100) && (z >= 50));
        Console.WriteLine(!(IDnum != "101"));
        Console.WriteLine((IDpass == "csharp") || (IDpass == "c#"));
        Console.WriteLine(((y<=x)&&(x!=30))&&((z>=y)||(z!=y)));
        Console.WriteLine(((IDnum!="2020-2"&&(IDpass=="csharp"))&&(IDnum!=IDpass)));
        Console.WriteLine(((((x>20)||((z<50)&&(z!=0)))&&(y<x))));
        Console.WriteLine((((z<=y)&&(z!=30))&&((y>=z)||(y!=z))));
        Console.WriteLine(((((y>10)&&(y<=x))&&(x==z))||(x!=0)));
        }
    }
}