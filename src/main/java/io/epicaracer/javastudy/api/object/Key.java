package io.epicaracer.javastudy.api.object;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	/*
	 * 객체의 동등  비교를 위해서는 equals()와 hashCode()의 재정의가 필요
	 */
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
