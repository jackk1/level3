import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class hashmappractice implements ActionListener{
	Scanner reader=new Scanner(System.in);
	HashMap<Integer, String> list;
	JFrame window;
	JPanel panel;
	JButton search;
	JButton view;
	JButton add;
	

		hashmappractice(){
		list=new HashMap<Integer, String>();
		window=new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    panel=new JPanel();
		add=new JButton("add");
		add.addActionListener(this);
		panel.add(add);
		search=new JButton("search");
		search.addActionListener(this);
		panel.add(search);
		view=new JButton("view");
		view.addActionListener(this);
		panel.add(view);
		window.add(panel);
			window.setSize(500,500);
  	}

	public static void main(String[] args) {
		hashmappractice hashmappractice=new hashmappractice();
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add){
			String id=JOptionPane.showInputDialog("enter in a valid id.");
			int idInt=Integer.parseInt(id);
			String name=JOptionPane.showInputDialog("enter in a valid name");
			list.put(idInt,  name);
			
			
		}
		if(e.getSource()==view){
			for(Integer i:list.keySet()){
				System.out.println("Id: "+i);
				System.out.println("Student: "+list.get(i));
			}
			
			
		}
		if(e.getSource()==search){
			System.out.println("Enter an integer :");  
	        int x = reader.nextInt();  
	        if(list.containsKey(x)){
	        	System.out.println(list.get(x));
	        }
	        
			
		}
	
		
}
}
		
				
		
	


