package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_effects implements ActionListener {

	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();
	static JButton button4 = new JButton();
	
	
	public void buttons() {
		JFrame window = new JFrame();
		window.setVisible(true);
		
		JPanel panel = new JPanel();
		window.add(panel);

		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		window.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton)e.getSource();
		 
		if(buttonPressed == button1) {
			playSound("glass-smash.wav");
		}
		
		if(buttonPressed == button2) {
			playSound("glass-smash.wav");
		}
		
		if(buttonPressed == button3) {
			playSound("vibrate-phone.wav");
		}
		
		if(buttonPressed == button4){
			playSound("vibrate-phone.wav");
		}
		
	}
	
	
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}


	
	
}
