using System;
class HelloWorld {
  static void Main(string []args) 
  {
    string s = "Madam" ;
    
    s=s.ToLower();
    
    foreach(char i in s)
    {
        Console.Write(i);
    }
    
  }
}
