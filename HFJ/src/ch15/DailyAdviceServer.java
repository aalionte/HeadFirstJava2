package ch15;

import java.net.*;
import java.io.*;

public class DailyAdviceServer {
	String[] adviceList = { "Take smaller bites", "Go for the tight jeans.",
			"One word: inappropriate", "Just for today, be honest." };

	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);

			while (true) {
				Socket sock = serverSock.accept();

				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args){
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}
