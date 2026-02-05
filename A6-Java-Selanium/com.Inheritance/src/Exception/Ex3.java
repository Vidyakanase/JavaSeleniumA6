package Exception;

public class Ex3 {
	public static void main (String []args) {
	int num= 25;
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num*2-1;j++)
		{
			if(i+j>num && j-i<num)
			{
				System.out.print("* ");
				try
				{
				   Thread.sleep(300);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage ());
				}
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	    }
	}
}