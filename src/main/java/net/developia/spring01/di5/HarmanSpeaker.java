package net.developia.spring01.di5;

import org.springframework.stereotype.Component;

@Component
public class HarmanSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker : �Ҹ��� Ű��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker : �Ҹ��� ���Դϴ�.");
	}

}
