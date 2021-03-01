import java.util.Scanner;

public class mod5Assign 
{

		static int fib(int numb) 
		{
			if(numb <= 1)
				return numb;
			else 
				return fib(numb-1) + fib(numb-2);
		}
		
		public static void main(String args[])
		{
			Scanner fibNum = new Scanner(System.in);
			
			int num1 = 0;
			while(num1 != -1)
			{
				System.out.println("\n Please enter an integer greater than 0: ");
				num1 = fibNum.nextInt();
				for (int i = 0; i < num1; i++)
				{
					System.out.print(fib(i) + " ");
				}
				long startTime = System.nanoTime();
				System.out.println("\nTime taken: " + startTime);
			}
		}
}
