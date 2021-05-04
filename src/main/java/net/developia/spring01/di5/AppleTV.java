package net.developia.spring01.di5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="appleTV")
public class AppleTV implements TV {

	@Autowired
	@Qualifier(value="orangeSpeaker")
	private Speaker speaker;

	public AppleTV() {}
	public AppleTV(Speaker speaker) {
		this.speaker = speaker;
	}	
	
	public void powerOn() {
		System.out.println("AppleTV : TV�� �մϴ�.");
	}

	public void powerOff() {
		System.out.println("AppleTV : TV�� ���ϴ�.");
	}

	public void soundUp() {
		if (speaker == null)
			System.out.println("AppleTV : �Ҹ��� Ű��ϴ�.");
		else 
			speaker.soundUp();
	}
	public void soundDown() {
		if (speaker == null)
			System.out.println("AppleTV : �Ҹ��� ���Դϴ�.");
		else
			speaker.soundDown();
	}

	public void channelUp() {
		System.out.println("AppleTV : ä���� �ø��ϴ�.");
	}

	public void channelDown() {
		System.out.println("AppleTV : ä���� �����ϴ�.");
	}

}
