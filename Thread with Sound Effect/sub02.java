//MultiThread 02
package project1;

public class sub02 extends Thread {

	public void run()
	{
		//Counting UP
		for (int i = 1; i < 10; i++) 
		//Counting up
		{
			System.out.println("Thread 02 : " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 02 is Finish");
	}
}
