public class Threading1 extends Thread
{
	public void run()
	{
		System.out.println("It is used to action for a thread");
	}
	public static void main(String[] args)
	{
		Threading1 th = new Threading1();
		th.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
		try{
			Thread.sleep(1500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}