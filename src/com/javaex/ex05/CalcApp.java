package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		while(true) {
			System.out.print(">>");
			String strLine = sc.nextLine();

			if (strLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			String[] data = strLine.split(" ");
			int num1 = Integer.parseInt(data[0]);
			String operator = data[1];
			int num2 = Integer.parseInt(data[2]);
			
			switch(operator) {
			case "+":
				Add add = new Add();
				add.setValue(num1, num2);
				result = add.calculate();
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				result = sub.calculate();
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				result = mul.calculate();
				break;
			case "/":
				Div div = new Div();
				div.setValue(num1, num2);
				result = div.calculate();
				break;
				
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
			}
			System.out.println(">> " + result);
		}
		sc.close();		
		
		
		
//		----------------------- 내가 한거 ----------------------
//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.print(">> ");
//			String inputLine = sc.nextLine(); // 한 줄로 입력 받음
//			String inputs[] = inputLine.split(" "); // 공백 기준으로 값 분리
//
//			// 입력 값이 3개가 아니면 예외 처리
//			if (inputLine.length() != 3) {
//
//			}
//
//			// 입력 값 분리 후 변수에 저장
//			int a = Integer.parseInt(inputs[0]);
//			char operator = inputs[1].charAt(0);
//			int b = Integer.parseInt(inputs[2]);
//
//			// 유효하지 않은 연산자 입력 시 예외 처리
//			if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//				throw new IllegalArgumentException("알 수 없는 연산입니다.");
//			}
//			
//			//	연산 수행
//			int result = 0;
//			switch (operator) {
//			case '+':
//				Add add = new Add();
//				add.setValue(a, b);
//				result = add.calculate();
//				break;
//			case '-':
//				Sub sub = new Sub();
//				sub.setValue(a, b);
//				result = sub.calculate();
//				break;
//			case '*':
//				Mul mul = new Mul();
//				mul.setValue(a, b);
//				result = mul.calculate();
//				break;
//			case '/':
//				Div div = new Div();
//				div.setValue(a, b);
//				result = div.calculate();
//				break;
//			}
//			System.out.println(">> " + result);
//		} catch (Exception e) {
//			System.out.println("예외 발생: " + e.getMessage());
//		} 
//		finally {
//			System.out.println("종료합니다.");
//			sc.close();
//		}
	}
}
