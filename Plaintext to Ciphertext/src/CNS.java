import java.util.*;

public class CNS {

	private static Scanner gyu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char US[] = new char[100];
		gyu = new Scanner(System.in);
		
		System.out.println("Enter Plain Text:- ");
		String Us = gyu.nextLine();
		
		System.out.println("Enter Key:- ");
		int key = gyu.nextInt();
		
		int len;
		
		len = Us.length();
		
		int i;
		char D;
		
		for(i = 0; i < len; i++)
		{
			D = Us.charAt(i);
			
			if(D >= 'a' && D <='z')
			{
				D = (char)(D + key);
				
				if(D >= 'z')
				{
					D = (char)(D - 'z' + 'a' - 1);
				}
				
				US[i] = D;
			}
			
			else if(D >= 'A' && D <= 'Z')
			{
				 D = (char)(D + (int)key);

                 if (D >= 'Z')

                 {
                     D = (char)(D - 'Z' + 'A' - 1);
                 }

                 US[i] = D;	

			}
		}
		System.out.println("Answer is a:- ");
		System.out.println(US);		
	
	}

}
