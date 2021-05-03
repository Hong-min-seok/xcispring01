package net.developia.spring01.di1;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV : TV�� �մϴ�.");
	}
	public void powerOff() {
		System.out.println("SamsungTV : TV�� ���ϴ�.");
	}
	public void soundUp() {
		if (speaker == null)
			System.out.println("SamsungTV : �Ҹ��� Ű��ϴ�.");
		else 
			speaker.soundUp();
	}
	public void soundDown() {
		if (speaker == null)
			System.out.println("SamsungTV : �Ҹ��� ���Դϴ�.");
		else
			speaker.soundDown();
	}
	public void channelUp() {
		System.out.println("SamsungTV : ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("SamsungTV : ä���� �����ϴ�.");
	}
	
}
