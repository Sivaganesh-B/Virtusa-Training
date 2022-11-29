using System;
using Component1;

class clAddComp1
{
    public static void Main()
    {
        Addition addComp = new Addition();
        addComp.varI=10;
        addComp.varJ=20;
       
        Console.WriteLine("Variable I vaqlue: {0}",addComp.varI);
        Console.WriteLine("Variable J vaqlue: {0}",addComp.varJ);
        Console.WriteLine("The Sum : {0}",addComp.Sum());
    }
}



Main.cs

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Component1
{
    public class Addition
    {
        private int i = 0,j=0;
        public int varI
        {
            get
            {
                return i;
            }
            set
            {
                i = value;
            }
        }
        public int varJ
        {
            get
            {
                return j;
            }
            set
            {
                j= value;
            }
        }
        public int Sum()
        {
            return i+j;
        }
    }
}
