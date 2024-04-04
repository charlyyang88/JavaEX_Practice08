package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {

		// try~catch문을 사용하여 에러를 수정하세요
		try {
			fileRead();
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 오류 발생");
		}

	}

	// 수정하지 마세요
	public static void fileRead() throws IOException {
		System.out.println("파일이 없습니다.");
	}
}
