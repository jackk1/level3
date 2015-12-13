package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logic.InstructionManager;

public class WindowBuilder implements ActionListener{
	InstructionManager instructionManager;
	JFrame window;
	JPanel panel;
	JButton upbutton;
	JButton downbutton;
	JButton rightbutton;
	JButton leftbutton;
	JButton recordbutton;
	JButton stopbutton;
	public WindowBuilder(){
		instructionManager=new InstructionManager();
		window=new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		upbutton=new JButton("up");
		upbutton.addActionListener(this);
		panel.add(upbutton);
		downbutton=new JButton("down");
		downbutton.addActionListener(this);
		panel.add(downbutton);
		rightbutton=new JButton("right");
		rightbutton.addActionListener(this);
		panel.add(rightbutton);
		leftbutton=new JButton("left");
		leftbutton.addActionListener(this);
		panel.add(leftbutton);
		recordbutton=new JButton("record");
		recordbutton.addActionListener(this);
		panel.add(recordbutton);
		stopbutton=new JButton("stop");
		stopbutton.addActionListener(this);
		panel.add(stopbutton);
		window.add(panel);
		window.setSize(500,500);
	}
	public static void main(String[] args) {
		WindowBuilder windowbuilder= new WindowBuilder();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add){
			instructionManager.addbuttonclicked();
		}
		
		if(e.getSource()==view{
			instructionManager.viewbuttonclicked();
		}
		if(e.getSource()==rightbutton){
			instructionManager.rightbuttonclicked();
		}
		if(e.getSource()==leftbutton){
			instructionManager.leftbuttonclicked();
		}
		if(e.getSource()==recordbutton){
			instructionManager.recordbuttonclicked();
		}
		if(e.getSource()==stopbutton){
			instructionManager.stopbuttonclicked();
		}
	}
}
