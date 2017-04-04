package com.zhiyou.p1.w3.d4.chatroom.clent;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatRoomClent {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.21.253", 8888);
			//开启新线程，接收控制台输入的内容，发送给服务器
			ClientSendMsg clientSendMsg = new ClientSendMsg(socket);
			new Thread(clientSendMsg).start();
			
			//
			InputStream inputStream = socket.getInputStream();
			Scanner scanner = new Scanner(inputStream);
			String msg = socket.getLocalAddress()+":\n"+scanner.nextLine();
			while (true) {
				System.out.println(msg);
				msg = scanner.nextLine();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
