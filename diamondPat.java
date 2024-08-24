import java.util.Scanner;
public class diamondPat
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("please provide number of rows:");
		int myrows = scan.nextInt();
		/*for(int m=1;m<=myrows;m++)
		{
			for(int n=1; n<m;n++)
			{
				System.out.println("  ");
			}
			for(int p=m;p<=myrows;p++)
			{
				System.out.print(". ");
			}
			System.out.println();
			}*/
			for(int m=1;m<=myrows-1;m--)
			{
				for(int n=1; n<m;n++)
				{
				
					System.out.println("  ");
				}
				for(int p=m;p<=myrows;p++)
				{
					System.out.print(". ");
				}
			
				System.out.println();
				}
		}
	}