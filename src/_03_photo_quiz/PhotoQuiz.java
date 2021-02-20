package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.DomainCombiner;

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

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String luna = "https://i.pinimg.com/564x/c0/96/3a/c0963aa67205f87962b1fdc147abd8d6.jpg"; 
		// 2. create a variable of type "Component" that will hold your image
Component ImageHolder;
		// 3. use the "createImage()" method below to initialize your Component
ImageHolder = createImage(luna);
		// 4. add the image to the quiz window
quizWindow.add(ImageHolder);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("Which anime is that cat from?");
		// 7. print "CORRECT" if the user gave the right answer
if (question.equalsIgnoreCase("sailor moon")) {
	JOptionPane.showMessageDialog(null, "correct");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "incorrect");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(ImageHolder);
		// 10. find another image and create it (might take more than one line
		// of code)
String artemis = "https://i.pinimg.com/originals/b3/57/fb/b357fbf25b49b1af92e3c36864d1bfd5.jpg";
Component imageholder;
imageholder = createImage(artemis);
		// 11. add the second image to the quiz window
quizWindow.add(imageholder);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String Question = JOptionPane.showInputDialog("What is the name of this cat?");
		// 14+ check answer, say if correct or incorrect, etc.
if (Question.equalsIgnoreCase("artemis")) {
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "incorrect");
}
quizWindow.remove(imageholder);
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
