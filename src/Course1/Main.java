package Course1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	
	{
		
		int numberA=5;
		double number12=4.5d;
		float babaNebar=99.99999f;
		
		int sum= (int)(numberA + babaNebar);
		System.out.println("Toplam: " + sum);
		
		int subtraction = (int)(babaNebar-numberA);
		System.out.println("subtraction :" + subtraction);
		
		int division =(int)(babaNebar/ numberA);
		System.out.println("division :" + division);
		
		System.out.println("-----------------------------------------------------------------------" );
		int number1=56;
		int number2=78;
		int number3=56;
		System.out.println("Number1>Number2 " +(number1>number2));
		
		
		System.out.println("Number1>Number2 " +(number1>number3));
		
		
		System.out.println("Number1>Number2 " +(number1>=number2));
		
		
		System.out.println("Number1!=Number2 " +(number1!=number2));
		
		
		System.out.println("Number1!=Number3 " +(number1!=number3));
		
		
		System.out.println("-----------------------------------------------------------------------" );
		
		
		System.out.println("- " +(number1==79 || number2==78 ));
		
		
		String isim="tuğba";
		

		
		String ad=Integer.toString(number3);
		
		boolean state1=false, state2=true;
		
		
		if ((number1==56 && number2 ==78) && (state1==false || state2==true))
			{
				System.out.println("-State true");
			}
		else 
			{
				System.out.println("-State false");
			}
		
		
		System.out.println("-----------------------------------------------------------------------" );
		
		
		if(number1==56)
		{
			System.out.println("Is lt 56 ?");
		} 
		else if(number2==78)
		{
			System.out.println("Is ıt 78 ?");
		}
		
		System.out.println("-----------------------------------------------------------------------" );
		
		
		int age=30;
		boolean married=false;
		if(age==20)
		{
			if(married==true)
			{
				System.out.println("Your uncle is 20 and married");
			}
			else
			{
				System.out.println("Your uncle is 20  year and not married");
			}
		}
		else if(age==30)
		{
			if(married==true)
			{
				System.out.println("Your uncle is 30 and married");
			}
			if(married==true)
			{
				System.out.println("Your uncle is 30 and not  married");
			}
			else
			{
				System.out.println("I don't konaw age.... Babaaaa");
			}
		}
		
		
		
		System.out.println("-----------------------------------------------------------------------" );
		String surname="Karapelit";
		if(surname.equals(""))
		{
			System.out.println("");
		}
		for(int x=0;x<10;x++)
		{
			System.out.println("Number" + (x+2));
		}
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------" );
		
		System.out.println("Please Enter Number :");
		 /* scan.nextInt();*/
		int number=50;
		int sum1=0;
		for(int b=0;b<=number;b++ )
		{
			sum1=sum1+b;
			System.out.println("-----------------------------------------"+b);
		}
		System.out.println(sum1);
		
		System.out.println("-----------------------------------------------------------------------" );

		
		for(int j=50; j>=0;j--)
		{
			sum1=sum1+j;
			System.out.println("-----------------------------------------"+j);
		
		}
	 
		System.out.println(sum1);
		System.out.println("-----------------------------------------------------------------------" );
		
		
		
	}

}
