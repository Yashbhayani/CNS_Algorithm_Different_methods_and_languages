#include <stdio.h>
#include <string.h>
int main()
{
  char a[100],D;
  int len,i,key,G,j;
  
	
  printf("Enter a plain text:- ");
  gets(a);
  len = strlen(a);	

	printf("\n");
	
	printf("1) Encryption \n");
	printf("2) Decryption \n");
	
	printf("choose option 1 & 2:- ");
	scanf("%d",&G);
	
	printf("\n");

  printf("Enter Key:- ");
  scanf("%d",&key);


		printf("\n");
		
		switch(G)
		{
			case 1:
		
		for(i=0; i<len; i++)
		{
			 D = a[i];

         if (D >= 65 && D <= 90)
		 {

            D = D + key;
            
            if (D >= 90)
		    {
               D = D - 26;           
            }  

            a[i] = D;
         }
         
         else if (D >= 97 && D <= 122)
		 {
            D = D + key;
         
		    if (D > 122)
			{
               D = D - 26;
            }
         
		    a[i] = D;
         }
		 else if(D == 32)
		 {
		 	D = 32;
		 	
		 	a[i] = D;
		 }	
		 
      }          
		 
		  printf("Answer is :- %s", a);	
		  break;
		  
		  case 2:
			
			{
			for(i=0; i<len; i++)
		{
			 D = a[i];

         if (D >= 65 && D <= 90)
		 {

            D = D + key;
            
            if (D >= 90)
		    {
               D = D - 26;           
            }  

            a[i] = D;
         }
         
         else if (D >= 97 && D <= 122)
		 {
            D = D + key;
         
		    if (D > 122)
			{
               D = D - 26;
            }
         
		    a[i] = D;
         }
		 else if(D == 32)
		 {
		 	D = 32;
		 	
		 	a[i] = D;
		 }	
		 
      }        
		 
		  printf("Answer is :- %s", a);	
	}  
	
	
          for(i=0; i<len; i++)
		{
			 D = a[i];

         if (D >= 65 && D <= 90)
		 {

            D = D - key;
            
            if (D >= 65 )
		    {
               D = D ;
            }  
            else
            {
            	D = 26 + D;
			}
			
            a[i] = D;
         }
         
         else if (D >= 97 && D <= 122)
		 {
            D = D - key;
        
		    if (D >= 97)
			{
               D = D;
            }
            else
            {
            	D = 26 + D;
			}       
         
		    a[i] = D;
         }
         else if(D == 32)
         {
         	D = 32;
         	
         	a[i] = D;
		 }
         
	}
	
		printf("\n Ans:- %s",a);		  	
		  	break;
		  	
		 default :
         printf("Invalid Inpute\n" );
	}


	
  return 0;
}
