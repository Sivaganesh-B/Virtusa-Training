using System;
using System.Linq;

class Pattern {
  static void Main(string []args) 
  {
    
    int n = 5;
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            Console.Write("*");
        }
        Console.WriteLine();
    }
    
    
  }
}
