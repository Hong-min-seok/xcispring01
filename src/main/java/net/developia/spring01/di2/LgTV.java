package net.developia.spring01.di2;

public class LgTV implements TV {
	private Speaker speaker;

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV : TV�� �մϴ�.");
	}

	public void powerOff() {
		System.out.println("LgTV : TV�� ���ϴ�.");
	}

	public void soundUp() {
		if (speaker == null)
			System.out.println("LgTV : �Ҹ��� Ű��ϴ�.");
		else
			speaker.soundUp();
	}

	public void soundDown() {
		if (speaker == null)
			System.out.println("LgTV : �Ҹ��� ���Դϴ�.");
		else
			speaker.soundDown();
	}

	public void channelUp() {
		System.out.println("LgTV : ä���� �ø��ϴ�.");
	}

	public void channelDown() {
		System.out.println("LgTV : ä���� �����ϴ�.");
	}
}
