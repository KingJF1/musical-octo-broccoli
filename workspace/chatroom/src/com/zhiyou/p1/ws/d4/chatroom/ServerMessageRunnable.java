package com.zhiyou.p1.ws.d4.chatroom;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

public class ServerMessageRunnable implements Runnable {

	private  Socket socket;
	private Map<String,Socket>  connectedSockets;
	public ServerMessageRunnable(Socket socket, Map<String, Socket> connectedSockets2) {
		super();
		this.socket = socket;
		this.connectedSockets = connectedSockets2;
	}
	@Override
	public void run() {
		//在这里处理客户端和服务端之间的数据互通，即使用socket为相连的客户端服务
		try {
			InputStream inputStream = socket.getInputStream();
			Scanner scanner = new Scanner(inputStream);
			String msg = socket.getLocalAddress()+":\n"+scanner.nextLine();
			while (true) {
				msg = scanner.nextLine();
				for (String  address:connectedSockets.keySet()) {
					Socket oneSocket = connectedSockets.get(address);
					oneSocket.getOutputStream().write((msg+"\n").getBytes());
				}
			}
		} catch (IOException e) {
			System.out.println(socket.getInetAddress().getHostAddress()+"已断开连接！！");
			connectedSockets.remove(socket).getInetAddress().getHostAddress();
		}
	}
}
