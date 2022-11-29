using System;

namespace Encapsulation
{
    class EncapsulationClass
    {
        private double length;
        private double width;
       
        public void GetValues()
        {
            length = Convert.ToDouble(Console.ReadLine());
            width = Convert.ToDouble(Console.ReadLine());
        }
        public double Area()
        {
            return length * width;
        }
        public void display()
        {
            Console.WriteLine("Length : {0}",length);
            Console.WriteLine("Width : {0}",width);
            Console.WriteLine("Area Calculated  : {0}",Area());
        }
    }
   
    class Progam
    {
        static void Main(string []args)
        {
            EncapsulationClass obj = new EncapsulationClass();
            obj.GetValues();
            obj.display();
        }
    }
}
