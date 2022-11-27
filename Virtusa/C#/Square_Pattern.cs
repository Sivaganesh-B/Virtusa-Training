using System;
using System.Linq;

class SquarePattern {
  static void Main(string []args) 
  {
    
    int n = 5;
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            Console.Write("*");
        }
        Console.WriteLine();
    }
    
    
  }
}
