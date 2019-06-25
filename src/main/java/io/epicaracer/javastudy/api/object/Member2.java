package io.epicaracer.javastudy.api.object;

/*
* 복제 가능한 객체를 만들기 위해서는 명시적으로 Clonable interface를 구현해야 함
* 얕은 복제 : thin clone
* 기본타입은 값이 복사되나 참조타입(객체)의 경우 주소가 복사(객체 원본 훼손 가능성 있음)
*/
public class Member2 implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member2 getMember() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {

		}

		return cloned;
	}
}
