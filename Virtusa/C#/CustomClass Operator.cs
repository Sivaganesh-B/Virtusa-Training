using System;

class CustomClass
{
    public int value;
   
    public static CustomClass operator +(CustomClass a,CustomClass b)
    {
        CustomClass obj1 = new CustomClass();
        obj1.value = a.value + b.value;
        return obj1;
    }
    public static CustomClass operator ++(CustomClass c)
    {
        c.value++;
        return c;
    }
}
class Program
{
    static void Main(string []args)
    {
        CustomClass obj = new CustomClass();
        obj++;
        Console.WriteLine(obj.value);
       
        CustomClass ob1 = new CustomClass();
        ob1++;
        Console.WriteLine(ob1.value);
       
        CustomClass ob2 = obj + ob1;
       
        Console.WriteLine(ob2.value);
    }
}
