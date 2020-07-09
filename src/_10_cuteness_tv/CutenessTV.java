package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CutenessTV implements ActionListener {
	
	JButton button1 = new JButton();

	JButton button2 = new JButton();
	
	JButton button3 = new JButton();
	
	
	public void button() {
		
		JFrame window = new JFrame();
		window.setVisible(true);
		
		JPanel panel = new JPanel();
		

		button1.setText("Duck");
		
		button2.setText("Frog");
		
		button3.setText("Unicorn");
		
		window.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		window.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	
@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	JButton pressed = (JButton)e.getSource();
	
	if (pressed == button1) {showDucks();}
	
	if (pressed == button2) {showFrog();}
	
	if (pressed == button3) {showUnicorns();}
	
	}
	
	
	
	void showDucks() {
	      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 }

	void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	void showUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}




	

	
	
}
