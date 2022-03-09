using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Monoalphabetic_Cipher
{
    internal class Program
    {
        static void Main(string[] args)
        {
            char[] US = new char[100];
            string SE1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            string SE2 = SE1.ToLower();

/*            Console.WriteLine("Enter To Alpha Bate Form:- ");
            string SE = Convert.ToString(Console.ReadLine());

            string SE1 = SE.ToUpper();
            string SE2 = SE2.ToLower();
*/

            Console.WriteLine("Enter a Replacement Key:- ");
            string AA = Convert.ToString(Console.ReadLine());

            string AA1 = AA.ToUpper();
            string AA2 = AA.ToLower();

            int Len = SE1.Length;

            Console.WriteLine("Enter Plain Text:- ");
            string SD = Convert.ToString(Console.ReadLine());

            int Len1 = SD.Length;

            int i, j;
            char D;

            for (i = 0; i < Len1; i++)
            {
                D = SD[i];

                if (D >= 65 && D <= 90)
                {
                    for (j = 0; j < Len; j++)
                    {
                        if (SD[i] == SE1[j])
                        {
                            D = AA1[j];
                        }
                    }
                }
                else if (D >= 97 && D <= 122)
                {
                    for (j = 0; j < Len; j++)
                    {
                        if (SD[i] == SE2[j])
                        {
                            D = AA2[j];
                        }
                    }
                }
                else if (D == 32)
                {
                    D = (char)32;
                }

                US[i] = D;
            }
            Console.WriteLine(US);


            Console.ReadLine();
        }
    }
}
