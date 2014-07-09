package chatPkg;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class SimpleChatClientA {

	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	
	
	public static void main(String args[]){
		SimpleChatClientA gui = new SimpleChatClientA();
		gui.go();
	}
	
	public void go(){
		//make gui and register a listener with the send button
		//call the setUpNetworking method
		JFrame frame = new JFrame("Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		
		sendButton.addActionListener(new SendButtonListener());
	
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		
		setUpNetworking();
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(400, 500);
		frame.setVisible(true);
	
		
	}
	
	private void setUpNetworking(){
		try{
			sock = new Socket("127.0.0.1", 5000);
			writer =new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	
	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			try{
				writer.println(outgoing.getText());
				writer.flush();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}
}