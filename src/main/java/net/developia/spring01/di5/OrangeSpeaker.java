package net.developia.spring01.di5;

import org.springframework.stereotype.Component;

@Component
public class OrangeSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker : �Ҹ��� Ű��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker : �Ҹ��� ���Դϴ�.");
	}

}
