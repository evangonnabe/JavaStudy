package io.epicaracer.javastudy.api.classes;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("io.epicaracer.javastudy.api.classes.SendAction");
//			Class clazz = Class.forName("io.epicaracer.javastudy.api.classes.ReceiveACtion");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
