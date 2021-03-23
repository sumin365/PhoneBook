package com.javaex.network.a22;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		//내 pc  IP주소 확인하는 법
		printLocalIp();
		
		
		//	서버의 주소를 확인하는법
		printServerIp("www.naver.com");
		printServerIp("www.google.com");
	}

	//	내 컴퓨터가 할당 받은 ip 확인(localhost)
	private static void printLocalIp() {
		try {
			//	내 Ip 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP:" + local.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	private static void printServerIp(String hostname) {
		try {//서버가 IP를 여러개 갖고 있으므로 배열로 쓰기 
			InetAddress[] adrs = InetAddress.getAllByName(hostname);
			for (InetAddress remote: adrs) {
				System.out.println(hostname + ": IP:" 
							+ remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	

}