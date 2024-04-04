package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	 if (b == 0) {
             // 0으로 나누는 경우 예외 처리
             throw new ArithmeticException("0으로 나눌 수 없습니다.");
         }
    	return a / b;
    }

}
