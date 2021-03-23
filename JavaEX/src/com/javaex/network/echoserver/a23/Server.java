package com.javaex.network.echoserver.a23;
//ppt06
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//1.	서버 소켓 
		ServerSocket serverSocket = null;
		
		try {
		//2.	바인드 - IP 연결
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(ips);
			
			//	3.시작 메시지
			System.out.println("<서버 시작>");
			System.out.println("SERVER: [연결을 기다립니다.]");
			
			//	4.연결 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
/*<클라이언트 시작>
CLIENT: [연결을 요청합니다]
CLIENT: [서버에 연결되었습니다]
CLIENT:>dkssud
*/
/*SERVER: [클라이언트가 연결되었습니다]
클라이언트:/127.0.0.1:8045
SERVER: [수신 메시지]dkssud
SERVER: [Echo back] :Echo back - dkssud
*/
//                                           서버       |  client
//SERVER: [연결을 기다립니다.]                       accept        connect
//SERVER: [클라이언트가 연결되었습니다]               socket생성
//SERVER: [메시지 수신]테스트메세지                    is              os
//SERVER: [Echo back] :Echo back - 테스트 메세지     os             is