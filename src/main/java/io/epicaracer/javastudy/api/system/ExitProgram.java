package io.epicaracer.javastudy.api.system;

public class ExitProgram {
	public static void main(String[] args) {
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) { //5가 입력되면 JVM을 종료하도록 보안관리자 설정.
					throw new SecurityException();
				}
			}
		});
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				System.exit(i); //exit() 실행 시 checkExit() 호출.
			} catch (SecurityException e) {
				
			}
			
		}
	}
}
