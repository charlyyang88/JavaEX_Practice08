package com.javaex.ex06;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// equals 메서드 오버라이드
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {  // 참조 주소가 같으면 true 반환
//            return true;
//        }
//        if (obj instanceof Point) {  // obj가 Point 클래스의 인스턴스인지 확인
//            Point other = (Point) obj;
//            // x와 y 값이 같으면 true 반환
//            return this.x == other.x && this.y == other.y;
//        }
//        return false; // obj가 Point 클래스의 인스턴스가 아니면 false 반환
//    }
	
}
