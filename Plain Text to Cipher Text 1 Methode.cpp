#include <stdio.h>
#include <string.h>
int main()
{
  char a[100],D,G;
  int len,i,key,P;
  
	
  printf("Enter a plain text:- ");
  gets(a);
  len = strlen(a);	

	printf("\n");
	
	printf("1) Encryption \n");
	printf("2) Decryption \n");
	
	printf("choose option 1 & 2:- ");
	scanf("%d",&P);
	
	printf("\n");

  printf("Enter Key:- ");
  scanf("%d",&key);


		printf("\n");
		
		if(P == 1)
		{
		
		for(i=0; i<=len; i++)
		{
			 D = a[i];

         if (D >= 'a' && D <= 'z')
		 {

            D = D + key;
            
            if (D > 'z')
		    {
               D = D - 'z' + 'a' - 1;
            }  

            a[i] = D;
         }
         
         else if (D >= 'A' && D <= 'Z')
		 {
            D = D + key;
         
		    if (D > 'Z')
			{
               D = D - 'Z' + 'A' - 1;
            }
         
		    a[i] = D;
         }	
      }          
		 
		  printf("Answer is :- %s", a);	
	}
	else
	{
			{
		
		for(i=0; i<=len; i++)
		{
			 D = a[i];

         if (D >= 'a' && D <= 'z')
		 {

            D = D + key;
            
            if (D > 'z')
		    {
               D = D - 'z' + 'a' - 1;
            }  

            a[i] = D;
         }
         
         else if (D >= 'A' && D <= 'Z')
		 {
            D = D + key;
         
		    if (D > 'Z')
			{
               D = D - 'Z' + 'A' - 1;
            }
         
		    a[i] = D;
         }	
      }          
		 
		  printf("Answer is :- %s", a);	
	}  
          for(i=0; i<=len; i++)
		{
			 G = a[i];

         if (G >= 'a' && G <= 'z')
		 {

            G = G - key;
            
            if (G >= 'a')
		    {
               G = G ;
            }  
            else
            {
            	G = 'z' + 'a' - G - 3;
			}
            
            a[i] = G;
         }
         
         else if (G >= 'A' && G <= 'Z')
		 {
            G = G - key;
         
		    if (G >= 'A')
			{
               G = G ;
            }
            else
            {
            	G = 'Z' + 'A' - G - 3;
			}
            
         
		    a[i] = G;
         }
         
	}
	
		printf("\n Ans:- %s",a);
	}

	
  return 0;
}
