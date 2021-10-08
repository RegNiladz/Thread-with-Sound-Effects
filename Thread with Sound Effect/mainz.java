package project1;
import java.util.Scanner;
public class mainz {
	public static void main (String[] args) throws InterruptedException
	{	Scanner scan = new Scanner(System.in);
	//First Trigger	
	System.out.println("[1.Start] [2.Terminate]");
		int a = scan.nextInt();
		if (a == 1)
		{
			sub subclass = new sub();
			subclass.start();
		
		}
		else if (a ==2 )
		{
			System.out.println("Terminated!");
		}
	//First 
		
		//Second
		Thread.sleep(3270);
		System.out.println("Welcome User");
		Thread.sleep(1000);
		System.out.println("Choose the Following, [1.Multithreading] [2.SingleThread]");
		int b = scan.nextInt();
		if (b==1)
		{
			sub00 submain = new sub00();
			submain.start();
		}
		else if(b==2)
		{
			singlethread single = new singlethread();
			single.start();
		}

	}

}
