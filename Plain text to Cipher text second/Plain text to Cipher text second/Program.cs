using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plain_text_to_Cipher_text_second
{
    internal class Program
    {
        static void Main(string[] args)
        {

            char[] US = new char[100];
            int len, i;
            char D;

            Console.WriteLine("Type a string to encrypt:- ");
            string Us = Convert.ToString(Console.ReadLine());

            len = Us.Length;

            Console.Write("Enter your key:- ");
            int key = Convert.ToInt16(Console.ReadLine());


            for (i = 0; i < len; i++)
            {
                D = Us[i];
                
                if (D >= 'a' && D <='z')
                {
                    D = (char)(D + (int)key);
                    
                    if(D >= 'z')
                    
                    {
                        D = (char)(D - 'z' + 'a' - 1);
                    }

                    US[i] = D;
                }
                else if (D >= 'A' && D <= 'Z')
                {
                    D = (char)(D + (int)key);

                    if (D >= 'Z')

                    {
                        D = (char)(D - 'Z' + 'A' - 1);
                    }

                    US[i] = D;
                }

            }

            Console.WriteLine(US);

            _ = Console.ReadLine();
        }
    }
}
