using System;
using System.Linq;

class RemoveVowel {
  static void Main(string []args) 
  {
    
    string s = "Hello World";
    
    string ans = "";
    
    string vow = "aeiouAEIUO";
    
    foreach(char i in s)
    {
        if(!vow.Contains(i))
        {
            ans+=i;
        }
    }
    
    Console.WriteLine(ans);
    
    
  }
}
