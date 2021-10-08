//MultiThread 01
package project1;

public class sub01 extends Thread{
	public void run()
	{
		//Counts down Negative
		for (int i = 1; i < 10; i--) 
		//Counts down Negative 
		{
			if(i == -10)
			{
				break;
			}
			
			System.out.println("Thread 01 : " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 01 is Finish");
	}

}
