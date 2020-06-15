using System;

namespace OOP
{
    class Program
    {
        static void Main(string[] args)
        {
            ExRectangular obj = new ExRectangular();
            obj.Height = 100;
            obj.Width = 50;
            Console.WriteLine(obj);
            Console.ReadLine();
        }
    }
}
