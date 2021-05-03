package net.developia.spring01.oop3;

public interface TV {
	public void powerOn();
	public void powerOff();
	public void soundUp();
	public void soundDown();
	public void channelUp();
	public void channelDown();
	public default void setSpeaker(Speaker speaker) {};
}
