package net.developia.spring01.di2;

public class OrangeSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker : �Ҹ��� �ø��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker : �Ҹ��� �����ϴ�.");
	}

}
