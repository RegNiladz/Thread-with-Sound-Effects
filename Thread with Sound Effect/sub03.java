package project1;
//Thread03
public class sub03 extends Thread{
	@Override
	public void run()
	{
		for (int i = 10; i > 0; i--) 
		{
			System.out.println("Thread 03 : " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 03 is Finish");
	}

}
