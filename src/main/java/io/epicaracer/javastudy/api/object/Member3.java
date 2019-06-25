package io.epicaracer.javastudy.api.object;

import java.util.Arrays;

public class Member3 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 하여 name, age를 복제
		Member3 cloned = (Member3) super.clone(); //Object의 clone()호출
		//참조 객체의 deep clone()
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member3 getMember() {
		Member3 cloned = null;
		try {
			cloned = (Member3) clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
