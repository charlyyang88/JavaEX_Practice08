package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); // false -> 다른 객체
		System.out.println(p2 == p3); // false -> 다른 객체
		System.out.println(p3 == p4); // false -> 다른 객체
		System.out.println(p4 == p1); // true -> 같은 객체
		System.out.println(p1.equals(p2)); 
		// false
		// Point 클래스에서는 equals() 메서드를 오버라이드하지 않았기 때문에 Object 클래스의 equals() 메서드가 실행
		// 이 때 Object 클래스의 equals() 메서드는 메모리 주소를 비교하므로 p1과 p2는 서로 다른 객체이지만, 내용이 같아도 false를 반환
		System.out.println(p4.equals(p1)); // true -> 같은 객체
	}

}


