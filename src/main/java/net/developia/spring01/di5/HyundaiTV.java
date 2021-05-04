package net.developia.spring01.di5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="hyundaiTV")
public class HyundaiTV implements TV {

	@Autowired
	@Qualifier(value="harmanSpeaker")
	private Speaker speaker;

	public HyundaiTV() {}
	public HyundaiTV(Speaker speaker) {
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
