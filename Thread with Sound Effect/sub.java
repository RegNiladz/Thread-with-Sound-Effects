package project1;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class sub extends Thread {
	@Override
	public void run() 
	{
		
		System.out.print("Loading:(");
		for(int i = 1; i < 50; i++)
		{	
			File sound = new File("Soundfiles/type.wav");
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
			
		}
		System.out.println(")Done!");
	}

}
