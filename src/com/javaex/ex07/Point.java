package com.javaex.ex07;

import javax.print.attribute.standard.MediaSize.Other;

// 요청사항 : 필드 x가 같으면 동등객체로 취급
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals() 메소드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
		//	매개변수(비교대상) -> Point로 캐스팅
		if (obj instanceof Point) {	//	obj Point 캐스팅 가능?
			//	캐스팅
			Point other = (Point) obj;
			return this.x == other.x;
		}
		return super.equals(obj);
//		return false;
	}

}
