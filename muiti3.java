class multi3 implements Runnable{
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String args[])
	{
		multi3 obj = new multi3();
		Thread th  = new Thread(obj);
		th.start();
	}
}