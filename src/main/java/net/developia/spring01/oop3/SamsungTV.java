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
			System.out.println("SamsungTV : TV를 켭니다.");
		else
			tv.powerOn();
	}
	public void powerOff() {
		if (this.tv == null)
			System.out.println("SamsungTV : TV를 끕니다.");
		else
			tv.powerOff();
	}
	public void soundUp() {
		
		if (this.speaker == null)
			System.out.println("SamsungTV : 소리를 키웁니다.");
		else
			speaker.soundUp();
	}
	public void soundDown() {
		if (this.speaker == null)
			System.out.println("SamsungTV : 소리를 줄입니다.");
		else
			speaker.soundDown();
	}
	public void channelUp() {
		if (tv == null)
			System.out.println("SamsungTV : 채널을 올립니다.");
		else
			tv.channelUp();
	}
	public void channelDown() {
		
		if (tv == null)
			System.out.println("SamsungTV : 채널을 내립니다.");
		else
			tv.channelDown();
	}
}
