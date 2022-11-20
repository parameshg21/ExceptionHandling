import java.util.*;
class EH1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		 try 
		 {
		  for(int i=0;i<n;i++)
		  {
		     arr[i]=sc.nextInt();
		  }
	  	   System.out.println("Enter the index of the array you want to access");
			    int keyIndex = sc.nextInt();
			    System.out.println("The array element at index "+ keyIndex +" = "+ arr[keyIndex]);
			    System.out.println("The array element successfully accessed");
		 }
		 catch(ArrayIndexOutOfBoundsException e) 
		 {
			System.out.println(e);
	 	}
		catch(InputMismatchException e) 
		{
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
