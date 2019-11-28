using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test2_5B
{
    class Program
    {
        interface IEnglishDimensions
        {
            float Length();
            float Width();
        }
        interface IMetricDimensions
        {
            float Length1();
            float Width1();
        }
        class Box
        {
            float lengthInches;
            float widthInches;
            public Box(float length, float width)
            {
                lengthInches = length;
                widthInches = width;
            }
            float Length()
            {
                return lengthInches;
            }
            float Width()
            {
                return widthInches;
            }
            float Length1()
            {
                return lengthInches * 2.54f;
            }
            float Width1()
            {
                return widthInches * 2.54f;
            }
            static void Main(string[] args)
            {
                Box myBox = new Box(30.0f, 20.0f);
                Console.WriteLine("Length(in):{0}", myBox.Length());
                Console.WriteLine("Width(in):{0}", myBox.Width());
                Console.WriteLine("Length(cm):{0}", myBox.Length1());
                Console.WriteLine("Width(cm):{0}", myBox.Width1());
                Console.Read();
            }

        }

    }
}
