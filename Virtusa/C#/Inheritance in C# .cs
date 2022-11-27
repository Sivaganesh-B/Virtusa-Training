using System;
using System.Linq;

class Oops {
  static void Main(string []args) 
  {
    
   Child a = new Child();
    
  }
  
}
class Parent
{
    public Parent()
    {
        Console.WriteLine("Parent");
    }
}
class Child : Parent
{
    public Child()
    {
        Console.WriteLine("Child");
    }
}
