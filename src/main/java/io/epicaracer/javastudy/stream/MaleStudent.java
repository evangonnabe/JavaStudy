package io.epicaracer.javastudy.stream;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list;
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()" ); //생성자를 호출하는 스레드 이름
	}
	
	//두 MaleStudent를 결합하는 메서드(병렬 처리 시에만 호출)
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumlate()" ); //accumulate()를 호출한 스레드 이름
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()" ); //combine()을 호출한 스레드 이름
	}
	
	public List<Student> getList(){
		return list;
	}
	
	
}
