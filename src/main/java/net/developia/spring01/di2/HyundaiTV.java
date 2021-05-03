package net.developia.spring01.di2;

public class HyundaiTV implements TV {
	
	public HyundaiTV() {
		System.out.println("HyundainTV() ����...");
	}
	
	public void init() {
		System.out.println("init() ����...");
	}

	private Speaker speaker;

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("HyundaiTV : TV�� �մϴ�.");
	}

	public void powerOff() {
		System.out.println("HyundaiTV : TV�� ���ϴ�.");
	}

	public void soundUp() {
		if (speaker == null)
			System.out.println("HyundaiTV : �Ҹ��� Ű��ϴ�.");
		else
			speaker.soundUp();
	}

	public void soundDown() {
		if (speaker == null)
			System.out.println("HyundaiTV : �Ҹ��� ���Դϴ�.");
		else
			speaker.soundDown();
	}

	public void channelUp() {
		System.out.println("HyundaiTV : ä���� �ø��ϴ�.");
	}

	public void channelDown() {
		System.out.println("HyundaiTV : ä���� �����ϴ�.");
	}

}
