import java.util.*;
class MathOperation
{
	public static void main(String[] args) throws ArithmeticException,NumberFormatException
	{
		if(args.length==5)
		{
		 int[] arr=new int[args.length];
		 int sum=0;
		 double avg=0;
		 try 
		 {
		  for(int i=0;i<args.length;i++)
		  {
		   arr[i]=Integer.parseInt(args[i]);
		  }
		  for(int i=0;i<arr.length;i++)
		  {
		   sum+=arr[i];
		  }
		  avg=sum/args.length;
		 } 
		 catch(Exception e) 
		 {
		  System.out.println(e);
		 }
		 System.out.println("sum= "+sum);
		 System.out.println("Avg= "+avg);
		}
		else
		System.out.println("Enter 5 values");
	}
}
