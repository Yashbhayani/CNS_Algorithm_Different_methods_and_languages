#include <stdio.h>
#include <string.h>
int main()
{
  char a[27],OP[100],D,G;
  int len,i,key,P,j,K;
  
  int AS,BS;
  char b[27];
  
  char A[27] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  AS = strlen(A);   
  
  char B[27] = "abcdefghijklmnopqrstuvwxyz";
  BS = strlen(B);
   	
  printf("Enter a Replacement key :- ");
  gets(a);
  len = strlen(a);	
	
	printf("%d",len);
	
		printf("\n");
	
		char s[100];
		int SS;
	
	printf("Enter a Plain Text:- ");
  	gets(s);
  	SS = strlen(s);
	  
	  	
	printf("\n");
	
	printf("1) Encryption \n");
	printf("2) Decryption \n");
	
	printf("choose option 1 & 2:- ");
	scanf("%d",&P);
		
	printf("\n");

for ( i = 0; i < len; i++)  
 {  
 	if (a[i] >= 65 && a[i] <= 90)  
 	{ 

 	b[i] = a[i] + 32;  
 	
 	}
 	else	
	{
 		
 	b[i] = a[i];
	
	}
 } 
	
	
	for ( i = 0; i < len; i++)  
 {  
 	if (a[i] >= 97 && a[i] <= 122)  
 	{ 

 	a[i] = a[i] - 32;  
 	
 	}
 	else 
 	{
 		
 	a[i] = a[i];
	
	}
 } 	

	
	printf("\n");
  
	switch(P)
	{
	case 1:
		
  	 for(i = 0; i < SS ; i++)
  {
  	D = s[i];
  	
  	if(D >= 65 && D <=90)
  	{
  		for(j = 0; j < AS; j++)
  		{
  			if(s[i] == A[j]	)
  			{
  				D = a[j];
			}
		}
  		
	}
	else if(D >= 97 && D <=122)
  	{
  		for(j = 0; j < AS; j++)
  		{
  			if(s[i] == B[j]	)
  			{
  				D = b[j];
			}
		}
  		
	}
	 else if(D == 32)
		 {
		 	D = 32;
		 }
		 
  	s[i] = D;
  }
  
  printf("Encryption :- %s",s);	
  break;
  
  case 2:
  		 for(i = 0; i < SS ; i++)
  {
  	D = s[i];
  	
  	if(D >= 65 && D <=90)
  	{
  		for(j = 0; j < AS; j++)
  		{
  			if(s[i] == A[j]	)
  			{
  				D = a[j];
			}
		}
  		
	}
	else if(D >= 97 && D <=122)
  	{
  		for(j = 0; j < AS; j++)
  		{
  			if(s[i] == B[j]	)
  			{
  					D = b[j];
			}
		}
  		
	}
	 else if(D == 32)
		 {
			 	D = 32;
		 }
		 
  	s[i] = D;
  }
  
  printf("Decryption in Plain Text to Cipher Text :- %s",s);	
    printf("\n");			
	 for(i = 0; i < SS ; i++)
  {
  	D = s[i];
  	
  	if(D >= 65 && D <=90)
  	{
  		for(j = 0; j < AS; j++)
  		{
  			if(s[i] == a[j]	)
  			{
  				D = A[j];
			}
		}
  		
	}
	else if(D >= 97 && D <=122)
  	{
  		for(j = 0; j < AS; j++)
  		{
  			if(s[i] == b[j]	)
  			{
  				D = B[j];
			}
		}  		
	}
	 else if(D == 32)
	{
			 	D = 32;
	}
		 
  	s[i] = D;
  }
  printf("\n");
  
  printf("Decryption in Cipher Text to Plain text :- %s",s);
  
  	break;
  	  	  	
		 default :
         printf("Invalid Inpute\n" );
  		
}

  return 0;
}
