package io.epicaracer.javastudy.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		//
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		//static method of interface
		RemoteControl.changeBattery();

	}
}
