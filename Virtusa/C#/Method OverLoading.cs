using System;
using System.Linq;

class Oops {
  static void Main(string []args) 
  {
    
    var ans = sum(1,2);
    var ans1 = sum(1.3,3.2);
    
    Console.WriteLine(ans);
    Console.WriteLine(ans1);
    
  }
  static int sum(int a,int b)
  {
      return a+b;
  }
  static double sum(double a,double b)
  {
      return a+b;
  }
}
