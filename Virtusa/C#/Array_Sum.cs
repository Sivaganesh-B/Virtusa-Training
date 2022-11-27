using System;
using System.Linq;

class ArraySum {
  static void Main(string []args) 
  {
    
    int [] a = {1,2,3,4,5};
    int [] b = {6,7,8,9,10};
    
    int sum = 0;
    int sum1 = b.Sum();
    
    foreach(int i in a)
    {
        sum += i;
    }
    
    Console.WriteLine(sum);
    Console.WriteLine(sum1);
    
    
  }
}
