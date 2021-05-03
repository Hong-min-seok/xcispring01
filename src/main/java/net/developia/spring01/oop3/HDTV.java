package net.developia.spring01.oop3;

public class HDTV extends SetTopBox implements TV {

	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("HDSamsungTV : TV�� �մϴ�.");
	}
	public void powerOff() {
		System.out.println("HDSamsungTV : TV�� ���ϴ�.");
	}
	public void soundUp() {
		
		if (this.speaker == null)
			System.out.println("HDSamsungTV : �Ҹ��� Ű��ϴ�.");
		else
			speaker.soundUp();
	}
	public void soundDown() {
		if (this.speaker == null)
			System.out.println("HDSamsungTV : �Ҹ��� ���Դϴ�.");
		else
			speaker.soundDown();
	}
	public void channelUp() {
		System.out.println("HDSamsungTV : ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("HDSamsungTV : ä���� �����ϴ�.");
	}
}