package net.developia.spring01.di2;

public class HyundaiTV implements TV {
	
	public HyundaiTV() {
		System.out.println("HyundainTV() 수행...");
	}
	
	public void init() {
		System.out.println("init() 수행...");
	}

	private Speaker speaker;

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("HyundaiTV : TV를 켭니다.");
	}

	public void powerOff() {
		System.out.println("HyundaiTV : TV를 끕니다.");
	}

	public void soundUp() {
		if (speaker == null)
			System.out.println("HyundaiTV : 소리를 키웁니다.");
		else
			speaker.soundUp();
	}

	public void soundDown() {
		if (speaker == null)
			System.out.println("HyundaiTV : 소리를 줄입니다.");
		else
			speaker.soundDown();
	}

	public void channelUp() {
		System.out.println("HyundaiTV : 채널을 올립니다.");
	}

	public void channelDown() {
		System.out.println("HyundaiTV : 채널을 내립니다.");
	}

}
