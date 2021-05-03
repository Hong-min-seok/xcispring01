package net.developia.spring01.di1;

public class HyundaiTV implements TV {
	public void powerOn() {
		System.out.println("HyundaiTV : TV를 켭니다.");
	}
	public void powerOff() {
		System.out.println("HyundaiTV : TV를 끕니다.");
	}
	public void soundUp() {
		System.out.println("HyundaiTV : 소리를 키웁니다.");
	}
	public void soundDown() {
		System.out.println("HyundaiTV : 소리를 줄입니다.");
	}
	public void channelUp() {
		System.out.println("HyundaiTV : 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("HyundaiTV : 채널을 내립니다.");
	}
	
}
