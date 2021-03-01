import java.util.Scanner;

public class model2 {

	static void fib2(int numb) 
	{
		int n1 = 0, n2 = 1;
		
		int i = 0;
		
		while (i < numb)
		{
			System.out.print(n1 + " ");
			
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			i += 1;
		}
	}
	
	public static void main(String args[])
	{
		Scanner fibNum = new Scanner(System.in);
		
		int num1 = 0;
		while(num1 != -1)
		{
			System.out.println("\n Please enter an integer greater than 0: ");
			num1 = fibNum.nextInt();
			
				fib2(num1);
				long startTime = System.nanoTime();
				System.out.println("\n" + startTime);
		}
	}
}
