package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame window = new JFrame();
        window.setVisible(true);
        
        JButton button = new JButton();
        window.add(button);
        window.pack();
        button.addActionListener(this);
        
       
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		
		 int rand = new Random().nextInt(5);
	        
	        if (rand == 0) {
	        	
	        	JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage.");
	        }
	        
	        else if (rand == 1) {
	        	
	        	JOptionPane.showMessageDialog(null, "A hunch is creativity trying to tell you something.");    
	        }
	        
	        else if (rand == 2) {
	        	
	        	JOptionPane.showMessageDialog(null, "A light heart carries you through all the hard times.");  
	        }
	        
	        else if (rand == 3) {
	        	
	        	JOptionPane.showMessageDialog(null, "A person of words and not deeds is like a garden full of weeds.");
	        }
	        
	        else if (rand == 4) {
	        	
	        	JOptionPane.showMessageDialog(null, "An acquaintance of the past will affect you in the near future.");
	        }
	        
	}

}
