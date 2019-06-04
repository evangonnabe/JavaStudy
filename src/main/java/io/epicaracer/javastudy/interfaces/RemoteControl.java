package io.epicaracer.javastudy.interfaces;

public interface RemoteControl {
	//constant value
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//static method
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
