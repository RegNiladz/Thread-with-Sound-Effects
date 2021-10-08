package project1;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class sub00 extends Thread{
	@Override
	public void run()
	{
		File sound = new File("Soundfiles/Binary.wav");
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
			Clip soundclip = AudioSystem.getClip();
			soundclip.open(audioStream);
		soundclip.start();
		
		
		
		} catch (UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			Thread.sleep(50);
			
			System.out.print("=");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
		
		
		sub01 thread01 = new sub01();
		sub02 thread02 = new sub02();
		sub03 thread03 = new sub03();
		sub04 thread04 = new sub04();
	

			
	
		
		//Start
		thread01.start();
		thread02.start();
		thread03.start();
		thread04.start();
		
		//Check
		System.out.println("Is Thread01 Active: " +thread01.isAlive());
		System.out.println("Is Thread02 Active: " +thread02.isAlive());
		System.out.println("Is Thread03 Active: " +thread03.isAlive());
		System.out.println("Is Thread04 Active: " +thread04.isAlive());
	}

}
