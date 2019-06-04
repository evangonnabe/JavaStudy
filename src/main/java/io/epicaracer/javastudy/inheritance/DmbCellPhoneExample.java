package io.epicaracer.javastudy.inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java phone", "Black", 10);
		
		System.out.println("�� : "+ dmbCellPhone.model);
		System.out.println("���� : "+ dmbCellPhone.color);
		System.out.println("ä�� : "+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.recieveVoice("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(2);
		dmbCellPhone.turnOffDmb();
		
	}
}
