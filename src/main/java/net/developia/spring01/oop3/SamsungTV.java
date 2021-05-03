package net.developia.spring01.oop3;

import java.util.Properties;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private TV tv;
	
	public SamsungTV() {}
	public SamsungTV(TV tv) {
		this.tv = tv;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		if (this.tv == null)
			System.out.println("SamsungTV : TV�� �մϴ�.");
		else
			tv.powerOn();
	}
	public void powerOff() {
		if (this.tv == null)
			System.out.println("SamsungTV : TV�� ���ϴ�.");
		else
			tv.powerOff();
	}
	public void soundUp() {
		
		if (this.speaker == null)
			System.out.println("SamsungTV : �Ҹ��� Ű��ϴ�.");
		else
			speaker.soundUp();
	}
	public void soundDown() {
		if (this.speaker == null)
			System.out.println("SamsungTV : �Ҹ��� ���Դϴ�.");
		else
			speaker.soundDown();
	}
	public void channelUp() {
		if (tv == null)
			System.out.println("SamsungTV : ä���� �ø��ϴ�.");
		else
			tv.channelUp();
	}
	public void channelDown() {
		
		if (tv == null)
			System.out.println("SamsungTV : ä���� �����ϴ�.");
		else
			tv.channelDown();
	}
}
