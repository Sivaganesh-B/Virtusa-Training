using System;

namespace ConsoleApplication
{
    class Program
    {
        static void Main(string []args)
        {
            var information = new {
                Id = 1,
                Name = "I am Neo",
                IsActive = true
            };
            Console.WriteLine("Id :"+information.Id);
            Console.WriteLine("Name :"+information.Name);
            Console.WriteLine("IsActive :"+information.IsActive);
           
            Console.ReadLine();
        }
    }
}
