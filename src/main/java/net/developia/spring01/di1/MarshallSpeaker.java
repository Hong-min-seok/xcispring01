package net.developia.spring01.di1;

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
