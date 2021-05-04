package net.developia.spring01.di5;

import org.springframework.stereotype.Component;

@Component
public class MarshallSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("MarshallSpeaker : �Ҹ��� Ű��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("MarshallSpeaker : �Ҹ��� ���Դϴ�.");
	}

}
