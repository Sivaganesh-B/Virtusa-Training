using System;
using System.Linq;

class Oops {
    
  static void Main(string []args) 
  {
    
   PrintName("Hi");
   PrintName();
    
  }
  static void PrintName(string name="Hello")
  {
      Console.WriteLine(name);
  }
  
}
