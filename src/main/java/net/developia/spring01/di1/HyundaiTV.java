package net.developia.spring01.di1;

public class HyundaiTV implements TV {
	public void powerOn() {
		System.out.println("HyundaiTV : TV�� �մϴ�.");
	}
	public void powerOff() {
		System.out.println("HyundaiTV : TV�� ���ϴ�.");
	}
	public void soundUp() {
		System.out.println("HyundaiTV : �Ҹ��� Ű��ϴ�.");
	}
	public void soundDown() {
		System.out.println("HyundaiTV : �Ҹ��� ���Դϴ�.");
	}
	public void channelUp() {
		System.out.println("HyundaiTV : ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("HyundaiTV : ä���� �����ϴ�.");
	}
	
}
