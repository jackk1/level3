import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuellingButtons().createUI();
	}

	JButton leftButton = new JButton("left");
	JButton rightButton = new JButton("right");
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame("demanding buttons");
	JPanel panel = new JPanel();
	
	
	

	private void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		leftButton.addActionListener(this);
		panel.add(leftButton);
		rightButton.addActionListener(this);
		panel.add(rightButton);
		frame.pack();
		
		// 1. Add the panel to the frame

		// 2. Make the frame visible

		// 3. Set the text of the leftButton to "Click me!"

		// 4. Set the text of the rightButton to "Click me!"

		// 5. Add an action listener to the leftButton

		// 6. Add an action listener to the rightButton

		// 7. Add the leftButton to the panel

		// 8. Add the rightButton to the panel

		// 9. Pack the frame

		// 10. Set the title of the frame to "Demanding Buttons"

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(arg0.getSource()==leftButton){
			rightButton.setText("no Click Me!");
			leftButton.setText("click me");
			leftButton.setPreferredSize(SMALL);
			rightButton.setPreferredSize(BIG);
			System.out.println("Hello World");
		}
		if(arg0.getSource()==rightButton){
			leftButton.setText("no Click Me!");
			rightButton.setText("click me");
			rightButton.setPreferredSize(SMALL);
			leftButton.setPreferredSize(BIG);
		}
		
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		frame.pack();
	}
}

