package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//--------------------------------------BANANNA---------------------------------------------		
		
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String bananna= "https://target.scene7.com/is/image/Target/GUEST_f5d0cfc3-9d02-4ee0-a6c6-ed5dc09971d1?wid=488&hei=488&fmt=pjpeg";
		// 2. create a variable of type "Component" that will hold your image
Component holder;
		// 3. use the "createImage()" method below to initialize your Component
holder = createImage(bananna);
		// 4. add the image to the quiz window
quizWindow.add(holder);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer1 = JOptionPane.showInputDialog(null, "What color is the bananna?");
		// 7. print "CORRECT" if the user gave the right answer
if (answer1 .equalsIgnoreCase("yellow")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(holder);

//----------------------------------------APPLE-----------------------------------------


		// 10. find another image and create it (might take more than one line
		// of code)
String apple = "https://anacortesoilandvinegarbar.com/wp-content/uploads/2015/11/apple.jpg";
holder= createImage(apple);
		// 11. add the second image to the quiz window
quizWindow.add(holder);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer2 = JOptionPane.showInputDialog("What color is the apple?");
		// 14+ check answer, say if correct or incorrect, etc.
if (answer2 .equalsIgnoreCase("red")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}

quizWindow.remove(holder);

//------------------------------------------CARROT----------------------------------------

String carrot = "https://www.alimentarium.org/en/system/files/thumbnails/image/AL012-02%20carotte.jpg";
	holder= createImage(carrot);
	quizWindow.add(holder);
	quizWindow.pack();
	String answer3 = JOptionPane.showInputDialog("What color is the carrot?");
	
	if (answer3 .equalsIgnoreCase("orange")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
	}
	else {
		JOptionPane.showMessageDialog(null, "INCORRECT");
	}
	
	quizWindow.remove(holder);
	
	//----------------------------------BROCCOLI----------------------------------------
	
	String broccoli = "https://i5.walmartimages.ca/images/Enlarge/094/505/6000200094505.jpg";
	holder= createImage(broccoli);
	quizWindow.add(holder);
	quizWindow.pack();
	String answer4 = JOptionPane.showInputDialog("What color is the broccoli?");
	
	if (answer4 .equalsIgnoreCase("green")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
	}
	else {
		JOptionPane.showMessageDialog(null, "INCORRECT");
	}
	
	quizWindow.remove(holder);
	
	//------------------------------BLUEBERRY------------------------------------------
	
	String blueberry = "https://freshpoint.com/wp-content/uploads/commodity-blueberry.jpg";
	holder= createImage(blueberry);
	quizWindow.add(holder);
	quizWindow.pack();
	String answer5 = JOptionPane.showInputDialog("What color is the blueberry?");
	
	if (answer5 .equalsIgnoreCase("blue")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
	}
	else {
		JOptionPane.showMessageDialog(null, "INCORRECT");
	}
	
	quizWindow.remove(holder);
	
	//--------------------------------EGGPLANT-------------------------------------------
	
	String eggplant = "https://1.bp.blogspot.com/_4smz8ewivFs/S73dnI-NHJI/AAAAAAAAAiQ/pRZncMZ7nuo/s1600/eggplant.jpg";
	holder= createImage(eggplant);
	quizWindow.add(holder);
	quizWindow.pack();
	String answer6 = JOptionPane.showInputDialog("What color is the eggplant?");
	
	if (answer6 .equalsIgnoreCase("purple")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
	}
	else {
		JOptionPane.showMessageDialog(null, "INCORRECT");
	}
	
	quizWindow.remove(holder);
	
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
