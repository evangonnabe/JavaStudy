package io.epicaracer.javastudy.inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java phone", "Black", 10);
		
		System.out.println("모델 : "+ dmbCellPhone.model);
		System.out.println("색상 : "+ dmbCellPhone.color);
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.recieveVoice("안녕하세요. 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("아 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(2);
		dmbCellPhone.turnOffDmb();
		
	}
}
