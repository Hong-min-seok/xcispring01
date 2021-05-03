package net.developia.spring01.di2;

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
