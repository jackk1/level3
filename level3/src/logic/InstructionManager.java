package logic;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class InstructionManager {
	boolean isrecording;
	String lastclicked;
	ArrayList<String>forward;
	ArrayList<String>backward;
	Stack<String>helpbackward;
	public InstructionManager(){
		forward=new ArrayList<String>();
		backward=new ArrayList<String>();
		helpbackward= new Stack<String>();
		isrecording=false;
		lastclicked=" ";
	}
	public void upbuttonclicked(){
		System.out.println("up");
		if (isrecording && !lastclicked.equals("up")){
			forward.add("up");
			helpbackward.push("up");
			lastclicked="up";
			
		}

	}
	public void downbuttonclicked(){
		System.out.println("down");
		if (isrecording && !lastclicked.equals("down")){
			forward.add("down");
			helpbackward.push("down");
			lastclicked="down";
			
		}

	}
	public void rightbuttonclicked(){
		System.out.println("right");
		if (isrecording && !lastclicked.equals("right")){
			forward.add("right");
			helpbackward.push("right");
			lastclicked="right";
			
		}

	}
	public void leftbuttonclicked(){
		System.out.println("left");
		if (isrecording && !lastclicked.equals("left")){
			forward.add("left");
			helpbackward.push("left");
			lastclicked="left";
			
		}
	}
	public void recordbuttonclicked(){
		System.out.println("record recieved");
		isrecording=true;
	}
	public void stopbuttonclicked(){
		System.out.println("stop recieved");
		if (isrecording){
			isrecording=false;
			for(int x=0; x<forward.size(); x++){
				backward.add(helpbackward.pop());
			}
		  String fw="forward: ";
		  String bw="backward: ";
		  for (String s: forward){
			  fw += s+",";
		  }
		  for (String y: backward){
			  bw += y+",";
		  }
		  JOptionPane.showMessageDialog(null, fw+"\n"+bw);

		}
		}
	}

