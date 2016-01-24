package logic;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {
	char currentletter;
	JFrame frame=new JFrame("typing tutor");
	JPanel panel=new JPanel();
	JLabel label=new JLabel(""+currentletter);
	
	public static void main(String[] args) {
		typingtutor t=new typingtutor();
		
	}
	typingtutor(){
		currentletter=generateRandomLetter();
		frame.setVisible(true);
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
	}
	private static char generateRandomLetter() {
		Random r= new Random();
		return (char) (r.nextInt(26)+'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("you typed: "+e.getKeyChar());
		if (currentletter==e.getKeyChar()){
			panel.setBackground(Color.green);
		}
		else{
			panel.setBackground(Color.red);
		}
		currentletter=generateRandomLetter();
		label.setText(""+currentletter);
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
