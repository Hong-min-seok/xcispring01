package net.developia.spring01.oop3;

public class HDTV extends SetTopBox implements TV {

	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("HDSamsungTV : TV를 켭니다.");
	}
	public void powerOff() {
		System.out.println("HDSamsungTV : TV를 끕니다.");
	}
	public void soundUp() {
		
		if (this.speaker == null)
			System.out.println("HDSamsungTV : 소리를 키웁니다.");
		else
			speaker.soundUp();
	}
	public void soundDown() {
		if (this.speaker == null)
			System.out.println("HDSamsungTV : 소리를 줄입니다.");
		else
			speaker.soundDown();
	}
	public void channelUp() {
		System.out.println("HDSamsungTV : 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("HDSamsungTV : 채널을 내립니다.");
	}
}