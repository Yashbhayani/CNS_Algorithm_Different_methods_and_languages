using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace Plaintext_to_Ciphertext
{
    internal class Program
    {
        static void Main(string[] args)
        {

			char[] US = new char[100];
			int len,i,P=0;
			char D,j;

            Console.WriteLine("Type a string to encrypt:- ");
            string Us = Convert.ToString( Console.ReadLine());

            len = Us.Length;
            
            Console.WriteLine("\n");


			Console.Write("Enter your key:- ");
            int key = Convert.ToInt16(Console.ReadLine());

            Console.WriteLine("\n");

			Console.WriteLine("1) Encryption");
			Console.WriteLine("2) Decryption");
			Console.WriteLine("Choose The option:-  ");
			int U = Convert.ToInt32((string) Console.ReadLine());


			Console.WriteLine("\n");
			switch (U)
            {
				case 1:
					for (i = 0; i < len; i++)
					{
						if (Us[i] >= 65 && Us[i] <= 90)
						{
							D = (char)((char)Us[i] + (int)key);

							if (D > 90)
							{
								j = ((char)((Us[i] + (int)key) - 90));
								D = (char)(64 + (int)j);
							}

							US[i] = D;


						}
						else if (Us[i] >= 97 && Us[i] <= 122)
						{
							D = (char)(Us[i] + (int)key);

							if (D > 122)
							{
								j = (char)((Us[i] + (int)key) - 122);
								D = (char)(96 + (int)j);
							}

							US[i] = D;

						}
						else if (Us[i] == 32)
						{
							D = (char)32;
							US[i] = (char)(int)D;
						}
						P++;
					}
					Console.WriteLine("Encryption is a to Plain text:- ");
					Console.WriteLine(US);
					break;

				case 2:
					for (i = 0; i < len; i++)
					{
						if (Us[i] >= 65 && Us[i] <= 90)
						{
							D = (char)((char)Us[i] + (int)key);

							if (D > 90)
							{
								j = ((char)((Us[i] + (int)key) - 90));
								D = (char)(64 + (int)j);
							}

							US[i] = D;


						}
						else if (Us[i] >= 97 && Us[i] <= 122)
						{
							D = (char)(Us[i] + (int)key);

							if (D > 122)
							{
								j = (char)((Us[i] + (int)key) - 122);
								D = (char)(96 + (int)j);
							}

							US[i] = D;

						}
						else if (Us[i] == 32)
						{
							D = (char)32;
							US[i] = (char)(int)D;
						}
						P++;
					}
					Console.WriteLine("Encryption is a to Plain text:- ");
					Console.WriteLine(US);

					for(i = 0; i < len; i++)
                    {
						if (US[i] >= 65 && US[i] <= 90)
						{
							D = (char)((char)US[i] - (int)key);

							if (D >= 65)
							{
                                D = (char)((int)D);
							}
							else
                            {
								D = (char)((int)26 + (int)D);
							}

							US[i] = D;
						}
						else if (US[i] >= 97 && US[i] <= 122)
						{
							D = (char)((char)US[i] - (int)key);

							if (D >= 97)
							{
								D = (char)((int)D);
							}
							else
                            {
								D = (char)((int)26 + (int)D);
							}

							US[i] = D;
						}
						else if (US[i] == 32)
						{
							D = (char)32;
							US[i] = D;
						}
					}
					Console.WriteLine("Decryption is a to cipher text:- ");
					Console.WriteLine(US);
					break;
			}
			
			
           
            Console.ReadLine();
        }
    }
}
