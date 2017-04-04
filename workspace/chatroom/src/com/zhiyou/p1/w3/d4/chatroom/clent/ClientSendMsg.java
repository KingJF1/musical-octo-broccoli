package com.zhiyou.p1.w3.d4.chatroom.clent;

import java.net.Socket;
import java.util.Scanner;

public class ClientSendMsg implements Runnable{
	private Socket socket;
	
	
	public ClientSendMsg(Socket socket) {
		this.socket = socket;
	}
	

	@Override
	public void run() {
		//接收客户端的控制台输入，发送到服务端
		Scanner scanner = new Scanner(System.in);
		String msg = socket.getLocalAddress()+":\n"+scanner.nextLine()+"\n";
		System.out.println(msg);
		while (true) {
			//发送到服务端去
			try {
				socket.getOutputStream().write((msg).getBytes());
				socket.getOutputStream().flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			msg = scanner.nextLine()+"\n";
		}
		
	}
	
}
