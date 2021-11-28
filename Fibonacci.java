package week1.day1;

public class Fibonacci
{	
	public static void main(String[] args)
	{
		int num1=0,num2=0,sum;
		System.out.println(num1);
		for(num1=1;num1<=8;)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
		System.out.println(sum);
		}
	}
}
