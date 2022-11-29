namespace ExtensionMethod
{
    public class MyClass
    {
        public void Method1() => Console.WriteLine("Initial Class Method 1");
       
        public void Method2() => Console.WriteLine("Initial Class Method 2");
    }
   
    class Program
    {
        static void Main(string []args)
        {
            MyClass obj = new MyClass();
            obj.Method1();
            obj.Method2();
            obj.Method3();
        }
    }
}



using System;

namespace ExtensionMethod
{
    public static class ExtendedClass
    {
        public static void Method3(this MyClass obj)
        {
            Console.WriteLine("Extended Method Using the same Object - Method 3");
        }
    }
}
