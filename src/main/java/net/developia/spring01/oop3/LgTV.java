package net.developia.spring01.oop3;

public class LgTV implements TV{
	public void powerOn() {
		System.out.println("LgTV : TV�� �մϴ�.");
	}
	public void powerOff() {
		System.out.println("LgTV : TV�� ���ϴ�.");
	}
	public void soundUp() {
		System.out.println("LgTV : �Ҹ��� Ű��ϴ�.");
	}
	public void soundDown() {
		System.out.println("LgTV : �Ҹ��� ���Դϴ�.");
	}
	public void channelUp() {
		System.out.println("LgTV : ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("LgTV : ä���� �����ϴ�.");
	}
}
