package io.epicaracer.javastudy.api.object;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	/* 객체가 소멸되기 전 마지막으로 사용했던 자원(데이터 연결, 파일)을 닫고 싶거나
	 * 중요한 데이터를 저장하고 싶다면 이 메서드를 override.
	 * (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
