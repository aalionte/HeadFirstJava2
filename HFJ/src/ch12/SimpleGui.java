package ch12;

import java.awt.event.*;

import javax.swing.*;

public class SimpleGui implements ActionListener{
	
	JButton button  ;
	
	public static void main(String[] args){
		SimpleGui gui = new SimpleGui();
		gui.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		button.setText("Clicked");
	}

}
