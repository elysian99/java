import java.util.Scanner;
class ArraySorting
{
	public static void main(String args[])
	{
		int n,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enter all the elements");
		for(int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0; i<n ;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("descending order");
			for(int i=0; i<n; i++)
			{
				System.out.print(a[i]+",");
			}
				System.out.print(a[n-1]);
		}
}
			
		
		